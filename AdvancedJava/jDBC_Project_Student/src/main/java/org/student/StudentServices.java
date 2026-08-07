package org.student;

import config.DBConfig;

import java.sql.*;

public class StudentServices {
    public void addStudent(Student student)
    {
        String sql= """
               INSERT INTO Students (name,email,course,marks) VALUES(?,?,?,?)
                """;
        try
        {
          Connection connection=  DBConfig.getConnection();
          PreparedStatement preparedStatement=connection.prepareStatement(sql);

          preparedStatement.setString(1,student.getName());
          preparedStatement.setString(2,student.getEmail());
          preparedStatement.setString(3,student.getCourse());
          preparedStatement.setDouble(4,student.getMarks());

          int rowAffectes=preparedStatement.executeUpdate();

            if(rowAffectes>0)
            {
                System.out.println("Student Inserted");
            }
            preparedStatement.close();;
            connection.close();


        } catch (SQLException e) {
            System.out.println("error"+ e.getMessage());
        }


    }

    public void viewAllStudent()
    {
        String sql= """
                select * from Students
                """;
        try
        {
         Connection connection=DBConfig.getConnection();
         PreparedStatement preparedStatement=connection.prepareStatement(sql);

         ResultSet resultSet=preparedStatement.executeQuery();

            System.out.println();

            System.out.println("student record");
            System.out.println("----------------");

            while(resultSet.next())
            {
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                String email=resultSet.getString("email");
                String course=resultSet.getString("course");
                double marks=resultSet.getDouble("marks");

                System.out.println("id: "+ id);
                System.out.println("name: "+ name);

                System.out.println("email: "+ email);

                System.out.println("course: "+ course);

                System.out.println("marks: "+ marks);

                System.out.println("---------------");

            }
            resultSet.close();
            preparedStatement.close();
            connection.close();





        } catch (Exception e) {
            System.out.println("error" +e.getMessage());
        }



    }

    public  Student  searchStudent(int id)
    {
        String sql= """
                select * from Students where id =?
                """;
        Student searched_student = null;

        try
        {
            Connection connection= DBConfig.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(sql);

            preparedStatement.setInt(1,id);

            ResultSet resultSet=preparedStatement.executeQuery();
           if(resultSet.next())
           {
//               System.out.println("student found");
//               System.out.println("ID: "+resultSet.getInt("id"));
//
//               System.out.println("name: "+resultSet.getString("name"));
//               System.out.println("email: "+resultSet.getString("email"));
//
//               System.out.println("course: "+resultSet.getString("course"));
//               System.out.println("marks: "+resultSet.getDouble("marks"));

               searched_student= new Student(

                       resultSet.getInt("id"),
                       resultSet.getString("name"),
                       resultSet.getString("email"),
                       resultSet.getString("course"),
                       resultSet.getDouble("marks")

               );
               


           }
           else{
               System.out.println("Student not found");
           }



        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return searched_student;
    }

    public void deleteStudent(int id)
    {
        String sql= """
                delete from Students where ( id )=(?)
                """;
        Connection connection=DBConfig.getConnection();
       try
       {
           PreparedStatement preparedStatement= connection.prepareStatement(sql);
           preparedStatement.setInt(1,id);
           int rowAffect=preparedStatement.executeUpdate();
           System.out.println(rowAffect);
           if (rowAffect>0)
           {
               System.out.println("Stduent deleted Sucessfully");
           }
           else{
               System.out.println("Student not found");
           }
       } catch (SQLException e) {
           System.out.println("error"+e.getMessage());
       }
    }

    public void updateStudent(Student student)
    {
        String sql= """
                update Students set name=? , email= ?,course= ?, marks=? where id=?
                """;
        Connection connection=DBConfig.getConnection();
        try
        {
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,student.getName());

            preparedStatement.setString(2,student.getEmail());

            preparedStatement.setString(3,student.getCourse());
            preparedStatement.setDouble(4,student.getMarks());
            preparedStatement.setInt(5,student.getId());
            int rowAffeect=preparedStatement.executeUpdate();
            if (rowAffeect >0) {
                System.out.println("Student Updated Sucesssfully");

            }
            else {
                System.out.println("Student not updated  there is some error brother fr se try kro");
            }

        } catch (SQLException e) {
            System.out.println("error" + e.getMessage());
        }

    }

}


