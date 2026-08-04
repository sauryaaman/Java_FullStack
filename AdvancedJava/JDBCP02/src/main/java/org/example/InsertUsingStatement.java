package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertUsingStatement {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/spark6";
        String username="root";
        String pass="Aman@2004";

        String sql= """
               insert into employee values(6,'Amansaurya','Mech',60000)
                """;
        try
        {
            Connection con= DriverManager.getConnection(url,username,pass);
            Statement statement=con.createStatement();
            int row_afftected=statement.executeUpdate(sql);
            System.out.println(row_afftected +"row inserted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
