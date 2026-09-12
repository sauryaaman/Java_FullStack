package com.example.SpingBootJPAP05.controller;


import com.example.SpingBootJPAP05.entity.Student;
import com.example.SpingBootJPAP05.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student)
    {
        return studentService.saveStudent(student);
    }

     @GetMapping("/{id}")
    public Student getById(@PathVariable Long id)
    {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Long id)
    {
          studentService.deleteStudent(id);
          return "Student Deleted";
    }
}
