package com.example.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class test_db
{
   public static void main(String[] args) throws SQLException, ClassNotFoundException {

   }
   public static void UpdateData(String sql ) throws SQLException, ClassNotFoundException { // function to update table

      PreparedStatement ps = null;
      try{                              //(anhy lec=rakam kam)         course=
         //String sql="UPDATE 'main'.'lectures' SET 'L1' ="+"'ana hena'"+" WHERE (`Name` == '" + "DB" + "');";

         DBconnector.connect(sql);
         System.out.println("the table is updated successfully");
      }
      catch(SQLException e)
      {
         System.out.println(e.toString());
      }
   }


}
