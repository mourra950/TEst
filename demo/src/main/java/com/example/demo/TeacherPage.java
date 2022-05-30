package com.example.demo;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
//lecture

    @FXML

    private Button L11;
    //sheets
    @FXML
    private Button L111;
    //quizes
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
    void BackToStudentPage(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SignupPage.class.getResource("TeacherMainPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) S3field.getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();


    }
    @FXML
    void UploadDes(ActionEvent event) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE 'main'.'Description' SET 'Description' ='" + DesField.getText() + "' WHERE (`Name` == '" + LoginPage.CourseName + "');";
        test_db.UpdateData(sql);
    }

    @FXML
    void UploadL1(ActionEvent event) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE 'main'.'lectures' SET 'L1' ='" + L1field.getText() + "' WHERE (`Name` == '" + LoginPage.CourseName + "');";
        test_db.UpdateData(sql);
    }

    @FXML
    void UploadL2(ActionEvent event) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE 'main'.'lectures' SET 'L2' ='" + L2field.getText() + "' WHERE (`Name` == '" + LoginPage.CourseName + "');";
        test_db.UpdateData(sql);
    }

    @FXML
    void UploadL3(ActionEvent event) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE 'main'.'lectures' SET 'L3' ='" + L3field.getText() + "' WHERE (`Name` == '" + LoginPage.CourseName + "');";
        test_db.UpdateData(sql);
    }

    @FXML
    void UploadQ1(ActionEvent event) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE 'main'.'Quizes' SET 'Q1' ='" + Q1field.getText() + "' WHERE (`Name` == '" + LoginPage.CourseName + "');";
        test_db.UpdateData(sql);
    }

    @FXML
    void UploadQ2(ActionEvent event) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE 'main'.'Quizes' SET 'Q2' ='" + Q2field.getText() + "' WHERE (`Name` == '" + LoginPage.CourseName + "');";
        test_db.UpdateData(sql);
    }

    @FXML
    void UploadQ3(ActionEvent event) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE 'main'.'Quizes' SET 'Q3' ='" + Q3field.getText() + "' WHERE (`Name` == '" + LoginPage.CourseName + "');";
        test_db.UpdateData(sql);
    }

    @FXML
    void UploadS1(ActionEvent event) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE 'main'.'Assignments' SET 'S1' ='" + S1field.getText() + "' WHERE (`Name` == '" + LoginPage.CourseName + "');";
        test_db.UpdateData(sql);
    }

    @FXML
    void UploadS2(ActionEvent event) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE 'main'.'Assignments' SET 'S2' ='" + S2field.getText() + "' WHERE (`Name` == '" + LoginPage.CourseName + "');";
        test_db.UpdateData(sql);
    }

    @FXML
    void UploadS3(ActionEvent event) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE 'main'.'Assignments' SET 'S3' ='" + S3field.getText() + "' WHERE (`Name` == '" + LoginPage.CourseName + "');";
        test_db.UpdateData(sql);
    }

    @FXML
    void OA1(ActionEvent event) throws Exception {
    String link= getLink("Assignments","A1");
        Browser.open(link);
    }

    @FXML
    void OA2(ActionEvent event) throws Exception {
        String link=getLink("Assignments","A2");
        Browser.open(link);
    }

    @FXML
    void OA3(ActionEvent event) throws Exception {
        String link=getLink("Assignments","A3");
        Browser.open(link);
    }

    @FXML
    void OL1(ActionEvent event) throws Exception {
        String link=getLink("lectures","L1");
        Browser.open(link);
    }

    @FXML
    void OL2(ActionEvent event) throws Exception {
        String link=getLink("lectures","L2");
        Browser.open(link);
    }

    @FXML
    void OL3(ActionEvent event) throws Exception {
        String link=getLink("lectures","L3");
        Browser.open(link);
    }

    @FXML
    void OQ1(ActionEvent event) throws Exception {
        String link=getLink("Quizes","Q1");
        Browser.open(link);
    }

    @FXML
    void OQ2(ActionEvent event) throws Exception {
        String link=getLink("Quizes","Q2");
        Browser.open(link);
    }

    @FXML
    void OQ3(ActionEvent event) throws Exception {
        String link=getLink("Quizes","Q3");
        Browser.open(link);
    }

    @FXML
    void initialize() throws SQLException, ClassNotFoundException {

//    DescriptionLabel.setText(getLink("Description",LoginPage.CourseName));
    CourseName.setText(LoginPage.CourseName);


    }

    public String getLink(String b, String c) throws SQLException, ClassNotFoundException {
        //b anhy table , c anhy column
        Connection con = DBconnector.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String temp = null;
        String sql = "SELECT * FROM 'main'.'" + b + "' WHERE Name = '" + LoginPage.CourseName + "'";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            temp = rs.getString(c);

        }
        System.out.println(temp);
        return temp;
    }

}


