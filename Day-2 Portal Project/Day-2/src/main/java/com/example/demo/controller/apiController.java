package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiController {
	
	@Value("${message}")
	private String name;
	
	@GetMapping("/getdata")
	public String getname() {
		return name;
	}
}
