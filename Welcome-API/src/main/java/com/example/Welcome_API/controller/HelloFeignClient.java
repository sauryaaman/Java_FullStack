package com.example.Welcome_API.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "Hello-API")
public interface HelloFeignClient {

    @GetMapping("/hello")
    public String invokeHelloApi();


}
