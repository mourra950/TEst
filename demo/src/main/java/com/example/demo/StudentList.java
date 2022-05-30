package com.example.demo;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class StudentList {

    ObservableList<Student> list = FXCollections.observableArrayList();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField IDfield;

    @FXML
    private TableColumn<Student, String> id;

    @FXML
    private TableColumn<Student, String> name;

    @FXML
    private TextField nameField;

    @FXML
    private TableView<Student> table;
    @FXML
    void AddS(ActionEvent event) throws SQLException {
        if(!nameField.getText().isEmpty() && !IDfield.getText().isEmpty())
        {
            try {
                DBconnector.connect("INSERT INTO `main`.`listed`(`name`,`course`,`id`) VALUES ('" + nameField.getText() + "','" + LoginPage.CourseName + "','" + IDfield.getText() + "');");

            }
            catch (Exception e)
            {
                Alertbox.display("SQL error","SQL got a problem");
            }
        }
        else
        {
        Alertbox.display("????","cant be empty");
        }
        loadTables();
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
    void RemoveS(ActionEvent event) throws SQLException {
        if(!nameField.getText().isEmpty() && !IDfield.getText().isEmpty())
        {
            try {
                String sql = "UPDATE 'main'.'listed' SET 'course' ='" + "o" + "' WHERE (`course` == '" + LoginPage.CourseName + "' AND 'name'=='"+nameField.getText()+"' AND 'id'=='"+IDfield.getText() +"');";
                test_db.UpdateData(sql);
            }
            catch (Exception e)
            {
                Alertbox.display("SQL error","SQL got a problem");
            }
        }
        else
        {
            Alertbox.display("????","cant be empty");
        }
        loadTables();
    }

    @FXML
    void initialize() throws SQLException {
        initcol();
        loadTables();

    }
    public void initcol() {
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));



    }
    private void loadTables() throws SQLException {
        String url = "jdbc:sqlite:src/main/DB/lms.db";
        Connection c = DriverManager.getConnection(url);
        Statement s = c.createStatement();
        String sql = "SELECT * FROM 'main'.'listed' WHERE course = '"+LoginPage.CourseName+"';";
        ResultSet rs = s.executeQuery(sql);
        list.clear();
        while (rs.next()) {
            String name = rs.getString("name");
            String Id = rs.getString("id");
            list.add(new Student(name,Id));
        }
        table.getItems().clear();
        table.getItems().addAll(list);
        c.close();
    }


}
