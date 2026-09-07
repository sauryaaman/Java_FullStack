package com.example.SpringBootP03.controller;

import com.example.SpringBootP03.dto.StudentRequest;
import com.example.SpringBootP03.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentPost {
    @PostMapping("/create")
    public String createStudent(@RequestBody StudentRequest request)
    {
     return "student Created: "+ request.getName();
    }
}
