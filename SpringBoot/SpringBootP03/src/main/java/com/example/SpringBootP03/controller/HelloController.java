package com.example.SpringBootP03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayhello()
    {
        return "hello Spring Boot";
    }

//    @GetMapping("/students")
//    public List<String> students()
//    {
//        return List.of("Aman","Saurya");
//    }
}
