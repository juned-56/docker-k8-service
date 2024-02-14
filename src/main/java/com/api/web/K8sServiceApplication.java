package com.api.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class K8sServiceApplication {

	@GetMapping("/app")
	public String getUser() {
		return "Hi this is testing App";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(K8sServiceApplication.class, args);
	}

}
