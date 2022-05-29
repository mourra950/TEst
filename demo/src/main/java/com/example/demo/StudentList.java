package com.example.demo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class StudentList {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField IDfield;

    @FXML
    private TextField nameField;

    @FXML
    void AddS(ActionEvent event) {

    }

    @FXML
    void Back(ActionEvent event) throws IOException {
        LoginPage.CourseName=null;
        FXMLLoader fxmlLoader = new FXMLLoader(SignupPage.class.getResource("TeacherMainPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) IDfield.getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void RemoveS(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }

}
