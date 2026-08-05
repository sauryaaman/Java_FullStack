package org.example.config;

import java.sql.*;

public class DBConfig {
    static final String url = "jdbc:mysql://localhost:3306/spark6";
    static final String username = "root";
    static final String pass = "root";

    public static Statement getInstance()
    {
        try
        {
            Connection con= DriverManager.getConnection(url,username,pass);
            Statement statement=con.createStatement();
            return statement;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static Connection getConnection()
    {
        Connection connection= null;
        try
        {
            connection= DriverManager.getConnection(url,username,pass);



        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

}

