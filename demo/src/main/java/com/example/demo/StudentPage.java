package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentPage {
    public static String description;
    public static String course;
    public static String courseCode;
    public static String courseName;

    @FXML
    private Button AI;

    @FXML
    private Button Algo;

    @FXML
    private Button CP;

    @FXML
    private Button CTRl;

    @FXML
    private Button DB;

    @FXML
    private Button TST;

    @FXML
    void GotoCourse(ActionEvent event) throws IOException, SQLException, ClassNotFoundException {
        if (event.getSource() == DB) {
            setPage("CSE_333", "DataBase","DB");
        }
        if (event.getSource() == AI) {
            setPage( "CSE472", "Artificial intellegence","AI");
        }
        if (event.getSource() == CP) {
            setPage( "CSE 439", "Design of Compilers","CP");
        }
        if (event.getSource() == CTRl) {
            setPage( "CSE371", "Control Enginnerring","CTRL");
        }
        if (event.getSource() == Algo) {
            setPage("CSE332", "Design of Algorithms","ALGO");
        }
        if (event.getSource() == TST) {
            setPage( "CSE 338", "Software Testing","TST");
        }
        FXMLLoader fxmlLoader = new FXMLLoader(StudentPage.class.getResource("CoursesStudent.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) DB.getScene().getWindow();
        stage.setTitle("Sign Up");
        stage.setScene(scene);
        stage.show();


    }

    void setPage( String code, String name,String courset) throws SQLException, ClassNotFoundException {
        description = getLink("Description",courset);
        courseCode = code;
        courseName = name;

        course=courset;
    }

    public String getLink(String b, String c) throws SQLException, ClassNotFoundException {
        //b anhy table , c anhy column
        Connection con = DBconnector.connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String temp = null;
        String sql = "SELECT * FROM 'main'.'" + b + "' WHERE Name = '" + c+ "'";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            temp = rs.getString(2);

        }
        return temp;
    }

}

