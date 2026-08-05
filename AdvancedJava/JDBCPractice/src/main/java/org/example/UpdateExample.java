package org.example;

import org.example.config.DBConfig;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateExample {
    public static void main(String[] args)  {
        String sql="""
                update employee set salary=10000 where id=3
               """;

        Statement statement=DBConfig.getInstance();
        try
        {
           int row= statement.executeUpdate(sql);
            System.out.println(row >0 ? "emplpoyee Updated": "employee not found");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }
}
