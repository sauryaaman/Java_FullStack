package com.example.StudentAPI.service;

import com.example.StudentAPI.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService {

    private final List<Student> studentList= new ArrayList<>();

    public StudentService()
    {
        studentList.add(new Student(101,"Aman",90));
        studentList.add(new Student(102,"saurya",80));


    }
     
    public List<Student> getAllStudent()
    {
        return studentList;
    }


    public Student getStudentById(int id)
    {
        for(Student  student:studentList)
        {
            if (student.getId()==id)
            {
             return student;

            }

        }
        return null;
    }




}