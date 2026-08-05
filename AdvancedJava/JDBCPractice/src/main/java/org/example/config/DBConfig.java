package org.example.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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

}

