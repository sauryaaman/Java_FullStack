package com.example.Hello_API.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Hello {


    @Autowired
    private Environment environment;
    @GetMapping("/message")
    public String message()
    {
       return environment.getRequiredProperty("app.message");
    }

    @GetMapping("/hello")
    public String HelloMsg()
    {
        String hello="Hello Aman Saurya ";
        String port=environment.getProperty("server.port");
        return hello + port;
    }
}
