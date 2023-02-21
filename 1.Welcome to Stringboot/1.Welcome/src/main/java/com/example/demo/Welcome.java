package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@ RestController
public class Welcome {
	@GetMapping("/welcome")
	public static String main(String[] args) {
		return "Welcome Spring Boot!";

	}

}