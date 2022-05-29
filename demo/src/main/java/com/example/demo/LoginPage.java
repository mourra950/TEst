package com.example.demo;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginPage {

    @FXML
    private TextField Password;

    @FXML
    private Button SignButton;

    @FXML
    private Button SignUpButton;

    @FXML
    private TextField Email;
    public static String CourseName;

    public void GotoSignUpPage(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(LoginPage.class.getResource("SignupPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) Email.getScene().getWindow();
        stage.setTitle("Sign Up");
        stage.setScene(scene);
        stage.show();
    }

    public void SignInTheUser(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        String admin = "false";
        boolean found =false;

        if (!Email.getText().isEmpty() && !Password.getText().isEmpty()) {
            try {
                Connection con =DBconnector.connect();
                PreparedStatement ps = null;
                ResultSet rs = null;

                String sql = "SELECT * FROM 'main'.'Users' WHERE email = '"+Email.getText()+"' AND password = '"+Password.getText()+"' ;";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next())
                {   admin= rs.getString("admin");
                    CourseName=rs.getString("Course");

                    found=true;
                }
                if(found)
                {
                    if(admin!="true") {
                    FXMLLoader fxmlLoader = new FXMLLoader(LoginPage.class.getResource("TeacherMainPage.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage = (Stage) Email.getScene().getWindow();
                    stage.setTitle("Login");
                    stage.setScene(scene);
                    stage.show();
                    }
                    else {
                        FXMLLoader fxmlLoader = new FXMLLoader(LoginPage.class.getResource("StudentPage.fxml"));
                        Scene scene = new Scene(fxmlLoader.load());
                        Stage stage = (Stage) Email.getScene().getWindow();
                        stage.setTitle("Login");
                        stage.setScene(scene);
                        stage.show();
                    }
                }
                else {
                    Alertbox.display("Not found","Login credits are not found");
                }

            } catch (Exception e) {
               Alertbox.display("Sql error","check SQl");
            }
        } else {
            Alertbox.display("error", "please fill in the blanks");
        }
    }
}

