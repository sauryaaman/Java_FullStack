package com.example.SpringBootP03.controller;

import com.example.SpringBootP03.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/students")
    public Student getStudent()
    {
        return new Student(101,"aman,",201);
    }

    @GetMapping("/students/{id}")
    public String getStudentById(@PathVariable int id)
    {
       return "Student is"+id;
    }

    @GetMapping("/students/search")
    public String searchStudent(@RequestParam String course)
    {
        return "Student course is "+ course;
    }


    @GetMapping("/product/search")
     public String productSearch(@RequestParam String cat,int minPrice)
     {
         return "procust cataogry is " + cat+" and the minium price is" + minPrice;
     }


}
