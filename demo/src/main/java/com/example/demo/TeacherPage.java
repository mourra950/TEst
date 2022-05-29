package com.example.demo;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TeacherPage {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label CourseCode;

    @FXML
    private Label CourseName;

    @FXML
    private TextArea DesField;

    @FXML
    private Label DescriptionLabel;

    @FXML
    private Button L1;

    @FXML
    private Button L11;

    @FXML
    private Button L111;

    @FXML
    private TextField L1field;

    @FXML
    private Button L2;

    @FXML
    private Button L21;

    @FXML
    private Button L211;

    @FXML
    private TextField L2field;

    @FXML
    private Button L3;

    @FXML
    private Button L31;

    @FXML
    private Button L311;

    @FXML
    private TextField L3field;

    @FXML
    private TextField Q1field;

    @FXML
    private TextField Q2field;

    @FXML
    private TextField Q3field;

    @FXML
    private TextField S1field;

    @FXML
    private TextField S2field;

    @FXML
    private TextField S3field;

    @FXML
    void BackToStudentPage(ActionEvent event) {

    }

    @FXML
    void UploadDes(ActionEvent event) throws SQLException, ClassNotFoundException {
        String sql="UPDATE 'main'.'Description' SET 'Description' ="+DescriptionLabel.getText()+" WHERE (`Name` == '" + LoginPage.CourseName + "');";
        test_db.UpdateData(sql);
    }

    @FXML
    void UploadL1(ActionEvent event) throws SQLException, ClassNotFoundException {
        String sql="UPDATE 'main'.'lectures' SET 'L1' ="+L1field.getText()+" WHERE (`Name` == '" + LoginPage.CourseName + "');";
        test_db.UpdateData(sql);
    }

    @FXML
    void UploadL2(ActionEvent event) throws SQLException, ClassNotFoundException {
        String sql="UPDATE 'main'.'lectures' SET 'L2' ="+L2field.getText()+" WHERE (`Name` == '" + LoginPage.CourseName + "');";
        test_db.UpdateData(sql);
    }

    @FXML
    void UploadL3(ActionEvent event) throws SQLException, ClassNotFoundException {
        String sql="UPDATE 'main'.'lectures' SET 'L3' ="+L3field.getText()+" WHERE (`Name` == '" + LoginPage.CourseName + "');";
        test_db.UpdateData(sql);
    }

    @FXML
    void UploadQ1(ActionEvent event) throws SQLException, ClassNotFoundException {
        String sql="UPDATE 'main'.'Quizes' SET 'Q1' ="+Q1field.getText()+" WHERE (`Name` == '" + LoginPage.CourseName + "');";
        test_db.UpdateData(sql);
    }

    @FXML
    void UploadQ2(ActionEvent event) throws SQLException, ClassNotFoundException {
        String sql="UPDATE 'main'.'Quizes' SET 'Q2' ="+Q2field.getText()+" WHERE (`Name` == '" + LoginPage.CourseName + "');";
        test_db.UpdateData(sql);
    }

    @FXML
    void UploadQ3(ActionEvent event) throws SQLException, ClassNotFoundException {
        String sql="UPDATE 'main'.'Quizes' SET 'Q3' ="+Q3field.getText()+" WHERE (`Name` == '" + LoginPage.CourseName + "');";
        test_db.UpdateData(sql);
    }

    @FXML
    void UploadS1(ActionEvent event) throws SQLException, ClassNotFoundException {
        String sql="UPDATE 'main'.'Assignments' SET 'S1' ="+S1field.getText()+" WHERE (`Name` == '" + LoginPage.CourseName + "');";
        test_db.UpdateData(sql);
    }

    @FXML
    void UploadS2(ActionEvent event) throws SQLException, ClassNotFoundException {
        String sql="UPDATE 'main'.'Assignments' SET 'S2' ="+S2field.getText()+" WHERE (`Name` == '" + LoginPage.CourseName + "');";
        test_db.UpdateData(sql);
    }

    @FXML
    void UploadS3(ActionEvent event) throws SQLException, ClassNotFoundException {
        String sql="UPDATE 'main'.'Assignments' SET 'S3' ="+S3field.getText()+" WHERE (`Name` == '" + LoginPage.CourseName + "');";
        test_db.UpdateData(sql);
    }

    @FXML
    void initialize() {


    }

}


