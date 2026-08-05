package org.example;

import org.example.config.DBConfig;

import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) {
        String sql="""
                delete from employee where id=3;
                """;
        Statement statement= DBConfig.getInstance();
        try
        {
            int rowAffect=statement.executeUpdate(sql);
            System.out.println(rowAffect>0 ? "Employee deleted" : "Employee not deleted");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        finally {
          try
          {
              statement.close();
          } catch (SQLException e) {
              throw new RuntimeException(e);
          }
        }
    }
}
