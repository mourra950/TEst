package com.example.demo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoursesStudent {

    @FXML
    private Label CourseCode;

    @FXML
    private Label CourseName;

    @FXML
    private Label DescriptionLabel;

    @FXML
    private Button L1;

    @FXML
    private Button L2;

    @FXML
    private Button L3;

    @FXML
    void BackToStudentPage(ActionEvent event) throws IOException {
        LoginPage.CourseName=null;
        FXMLLoader fxmlLoader = new FXMLLoader(SignupPage.class.getResource("StudentPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) L3.getScene().getWindow();
        stage.setTitle("Student");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void BackTomain(ActionEvent event) throws IOException {
        LoginPage.CourseName=null;
        FXMLLoader fxmlLoader = new FXMLLoader(SignupPage.class.getResource("LoginPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) L3.getScene().getWindow();
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
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
    void initialize() {
        CourseCode.setText(StudentPage.courseCode);
        CourseName.setText(StudentPage.courseName);
        DescriptionLabel.setText(StudentPage.description);

    }
    public String getLink(String b, String c) throws SQLException, ClassNotFoundException {
        //b anhy table , c anhy column
        System.out.println(b);
        System.out.println(c);
        Connection con = DBconnector.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String temp = null;
        String sql = "SELECT * FROM 'main'.'" + b + "' WHERE Name = '" + StudentPage.course + "'";
        System.out.println(sql);
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            temp = rs.getString(c);

        }
        System.out.println(temp);
        return temp;
    }

}
