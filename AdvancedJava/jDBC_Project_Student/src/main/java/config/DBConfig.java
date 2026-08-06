package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConfig {
    final static String url ="jdbc:mysql://localhost:3306/JDBC_Project01";
    final static String username="root";
    final static String pass="root";

   public static Statement getInstance()
   {
       try
       {
           Connection connection= DriverManager.getConnection(url,username,pass);
          Statement statement= connection.createStatement();
          return statement;
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
   }

   public static  Connection getConnection()
   {
       try
       {
           Connection connection= DriverManager.getConnection(url,username,pass);
           return connection;
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
   }

}
