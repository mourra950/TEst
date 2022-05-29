package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentPage {
    public static String description;
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
    void GotoCourse(ActionEvent event) throws IOException {
        if (event.getSource() == DB) {
            setPage("Database System Concepts and Architecture , Data Modeling Using the Entity-Relationship (ER) Model ,\nstudying Enhanced Entity-Relationship (EER) Modeling  , Relational Database Design by ER- and EERR-to-Relational Mapping and SQL : Schema Definition,\nConstraints, and Queries and Views .", "CSE_333", "DataBase");
        }
        if (event.getSource() == AI) {
            setPage("Artificial intelligence languages. Problem-solving in artificial intelligence.\nProblem- solving by searching: uninformed search, informed search, heuristic functions. Adversarial search and game theory.\nExpert Systems: rule-based systems, inference, probabilistic reasoning.\nLearning methodologies. Decision theory. Classification. Clustering.\nNeural Networks. Evolutionary Computation. Genetic Algorithms.\nArtificial intelligence applications.", "CSE472", "Artificial intellegence");
        }
        if (event.getSource() == CP) {
            setPage("Fundamental concepts in automata theory and formal languages including grammar, deterministic and nondeterministic finite automata, \nregular expression, formal language, pushdown automaton ,Systems software,\ncompilers, interpreters.Byte-codes. \nLexical analysis: interface with input, parser and symbol table, token, lexeme and patterns.\nSyntax analysis: context-free grammars, ambiguity, precedence,and top-down parsing.", "CSE 439", "Design of Compilers");
        }
        if (event.getSource() == CTRl) {
            setPage("Introduction to feedback control systems.\nCharacteristics of closed loop systems.\nAdvantages and disadvantages of feedback.\nObtainment of transfer functions along with illustrative examples.\nBlock diagram reduction.\nSignal flow graphs.\nSensitivity to parameter variation.\nPerformance of control systems.\nStandard test signals.\nTime response of first and second order systems and response specs.\nIdentifications of systems from time response. \nStatic error analysis", "CSE371", "Control Enginnerring");
        }
        if (event.getSource() == Algo) {
            setPage("Design advanced algorithms using. \n" +
                    "Define and analyze of the algorithms in different styles, including recursive algorithms.\n" +
                    "Demonstrate a familiarity with major fundamental algorithms in sorting. \n" +
                    "Apply important algorithmic design paradigms and methods of analysis. \n" +
                    "Understand, analyze and apply standard algorithms involving tree and graph.  \n● Define and analyze the complexity of algorithms in various styles.", "CSE332", "Design of Algorithms");
        }
        if (event.getSource() == TST) {
            setPage("Distinction between the software testing, verification and validation.\n" +
                    "Understand how to test a software application using: unit test, integration tests, black-box tests, white-box tests.\n" +
                    "Know how to prepare test cases covering all statements, branched, conditions, or paths\n" +
                    "Understand how to test a software application based on the variables/data definition and use sites (ADUP)\n" +
                    "Know the FSM based testing process\n" +
                    "Know how to test an application based on non-functional requirements.\n" +
                    "Know what the existing testing tools can do for the tester.", "CSE 338", "Software Testing");
        }
        FXMLLoader fxmlLoader = new FXMLLoader(StudentPage.class.getResource("CoursesStudent.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Sign Up");
        stage.setScene(scene);
        stage.show();


    }

    void setPage(String Des, String code, String name) {
        description = Des;
        courseCode = code;
        courseName = name;
    }


}

