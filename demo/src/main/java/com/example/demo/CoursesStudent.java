package com.example.demo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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
    void BackToStudentPage(ActionEvent event) {

    }

    @FXML
    void BackTomain(ActionEvent event) {

    }
    @FXML
    void initialize() {
        CourseCode.setText(StudentPage.courseCode);
        CourseName.setText(StudentPage.courseName);
        DescriptionLabel.setText(StudentPage.description);

    }

}
