package com.example.Welcome_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class WelcomeApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(WelcomeApiApplication.class, args);
	}

	@Bean
	public RestTemplate getInstance()
	{
        return new RestTemplate();
	}

}


