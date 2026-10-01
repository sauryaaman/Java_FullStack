package com.example.Spring_SecurityP02.DemoController;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class DemoController {
    @GetMapping("/public/hello")
        public Map<String,String> hello()
    {
        return  Map.of("Message"," Anyone can acces this");
    }

    @GetMapping("/profile")
    public Map<String,String> profile(Principal principal)
    {
       return Map.of("LoggeddInUser",principal.getName());
    }
    @GetMapping("/admin/report")
    public Map<String,String> report()
    {
        return Map.of("report","Only admin can acces ");
    }

}
