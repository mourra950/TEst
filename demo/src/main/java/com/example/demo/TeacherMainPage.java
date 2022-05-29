package com.example.demo;



import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TeacherMainPage {
    @FXML
    private Button b;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void GotoCourse(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SignupPage.class.getResource("TeacherPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) b.getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void GotoList(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SignupPage.class.getResource("StudentList.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) b.getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void Logout(ActionEvent event) throws IOException {
        LoginPage.CourseName=null;
        FXMLLoader fxmlLoader = new FXMLLoader(SignupPage.class.getResource("LoginPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) b.getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void initialize() {

    }

}
