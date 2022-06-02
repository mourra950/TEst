package com.example.demo;

import java.sql.*;

public class DBconnector {
    public static Connection connect() throws SQLException, ClassNotFoundException {
        Connection con = null;

        String url = "jdbc:sqlite:demo/src/main/DB/lms.db";
        Class.forName("org.sqlite.JDBC");
        con = DriverManager.getConnection(url); //connecting to our database
        System.out.println("Connected!");

        return con;
    }

    public static void connect(String a) throws SQLException {
        Connection conn = null;


        String url = "jdbc:sqlite:demo/src/main/DB/lms.db";
        conn = DriverManager.getConnection(url);
        Statement s = conn.createStatement();

        //INSERT INTO `sql11418209`.`signup` (`mail`, `Name`, `Surname`, `Password`, `address`,`gender`) VALUES ('"+s1+"','"+s2+"', '"+s3+"', '"+s4+"', '"+s5+"','"+s6+"');"
        //User user = new User("mohamed","mostafa ragab","010002222222");
        // s.executeUpdate("INSERT INTO `main`.`Users`(`Mail`,`Name`,`Password`) VALUES ('omar',NULL,NULL);");
        //"UPDATE `main`.`User` SET `Borrowed Books` = '" + k + "' WHERE (`Name` = '" + Name + "');"
        s.executeUpdate(a);
        conn.close();

        System.out.println("Connection to SQLite has been established.");

    }
}

