package com.example.SpringBootProject1;

import  org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject1Application.class, args);
	}
	@Bean
   public RestTemplate getInstance()
   {
	   return new RestTemplate() ;
   }
}
