package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@ RestController
public class HelloWorld {
	@GetMapping("/")
	public String show(@RequestParam String id) {
		return "Hello " + id;
	}

}