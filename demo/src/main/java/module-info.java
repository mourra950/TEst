module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires java.desktop;
    requires org.junit.jupiter.api;
    requires junit;


    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
}