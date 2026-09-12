package com.example.SpingBootJPAP05.controller;


import com.example.SpingBootJPAP05.entity.Student;
import com.example.SpingBootJPAP05.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public List<Student> getAllStudent()
    {
        return studentService.getAllStudentData();
    }
}
