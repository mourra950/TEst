package com.example.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class test_db
{
   public static void UpdateData() throws SQLException, ClassNotFoundException { // function to update table
      Connection con =DBconnector.connect();
      PreparedStatement ps = null;
      try{
         String sql="UPDATE lectures set L1 = ? WHERE Name = ? ";
         ps=con.prepareStatement(sql);
         ps.setString(1,"https://lms.eng.asu.edu.eg/pluginfile.php/442500/mod_resource/content/1/DB-Lect2.pdf");
         ps.setString(2,"DB");
         ps.execute();
         System.out.println("the table is updated successfully");
      }
      catch(SQLException e)
      {
         System.out.println(e.toString());
      }
   }


}
