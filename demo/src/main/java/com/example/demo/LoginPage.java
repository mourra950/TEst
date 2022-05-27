package com.example.demo;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginPage {

    @FXML
    private TextField Password;

    @FXML
    private Button SignButton;

    @FXML
    private Button SignUpButton;

    @FXML
    private TextField Username;



    public void GotoSignUpPage(ActionEvent actionEvent) {
        System.out.println("ana hena");
    }

    public void SignInTheUser(ActionEvent actionEvent) {
    }
}

