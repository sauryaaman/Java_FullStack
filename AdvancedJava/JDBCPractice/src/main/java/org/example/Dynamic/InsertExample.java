package org.example.Dynamic;

import org.example.config.DBConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class InsertExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter id: ");
        int id= sc.nextInt();
        sc.nextLine();

        System.out.println("enter name: ");
        String name= sc.nextLine();

        System.out.println("enter the dept: ");;
        String dept = sc.nextLine();

        System.out.println("enter the salary: ");
        double salary=sc.nextDouble();

        String sql= """
                insert into employee(id,name,dept,salary) values (?, ?, ?, ? )
                """;
        System.out.println(sql);

        try
        {
           Connection connection= DBConfig.getConnection();
           PreparedStatement preparedStatement=connection.prepareStatement(sql);


           preparedStatement.setInt(1,id);
           preparedStatement.setString(2,name);
           preparedStatement.setString(3,dept);
           preparedStatement.setDouble(4,45000);


           int rowAffect=preparedStatement.executeUpdate();
            System.out.println(rowAffect>0 ? "Employee Inserted" :"Employee not inserted");


        }
        catch (SQLException e)
        {
           e.printStackTrace();
        }
    }
}
