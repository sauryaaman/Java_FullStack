package org.example;

import org.example.config.DBConfig;

import java.sql.*;


public class Insert
{

    public static void main(String[] args)  {
        String sql= """
            insert into employee values(7,'kajal','teacher',900000)
            """;
        Statement statement=DBConfig.getInstance();


       try
       {
          int rowAffect= statement.executeUpdate(sql);
           System.out.println(rowAffect>0 ? "employee inserted" : "employee not inserted");

       } catch (SQLException e) {
           System.out.println(e.getMessage());
           throw new RuntimeException(e);
       }


    }
}
