package com.example.demo;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

public class SignupPage {

    @FXML
    private Button BackButton;

    @FXML
    private TextField Email;

    @FXML
    private TextField Name;

    @FXML
    private TextField Password;

    @FXML
    private TextField Phone;

    @FXML
    private Button SignUpButton;

    @FXML
    void BackToMain(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SignupPage.class.getResource("LoginPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void SignUpPage(ActionEvent event) throws SQLException {
        try {
            if (!Name.getText().isEmpty() && !Password.getText().isEmpty() && !Phone.getText().isEmpty() && !Email.getText().isEmpty()) {
                com.example.demo.DBconnector.connect("INSERT INTO `main`.`Users`(`email`,`password`,`phone`,`name`) VALUES ('" + Email.getText() + "','" + Password.getText() + "','" + Phone.getText() + "','" + Name.getText() + "');");
            }
            else {
                Alertbox.display("Error","can not be empty");
            }
        }
        catch (Exception e)
        {
            Alertbox.display("SQl Error","the email already exists");
        }

    }
}
