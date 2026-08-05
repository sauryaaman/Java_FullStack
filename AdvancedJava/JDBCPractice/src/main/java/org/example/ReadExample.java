package org.example;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadExample {

    public static void main(String[] args) {
      String url= "jdbc:mysql://localhost:3306/spark6";
      String username="root";
      String pass= "root";
      String sql= "select * from employee";

      try
      {
          Connection con= DriverManager.getConnection(url,username,pass);
          Statement statement=con.createStatement();
          ResultSet resultset= (ResultSet) statement.executeQuery(sql);

          while(resultset.next())
          {
              int id = resultset.getInt("id");
              String name= resultset.getString("name");
              String dept= resultset.getString("dept");
              double salary= resultset.getDouble("salary");

              System.out.println(
                      id + " | "+ name+" | "+ dept +" | "+ salary
              );
         }
          

      } catch (Exception e) {
          System.out.println(e.getMessage());
      }
    }
}
