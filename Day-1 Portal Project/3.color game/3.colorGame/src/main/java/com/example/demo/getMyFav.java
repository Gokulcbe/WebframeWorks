package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getMyFav {
	@GetMapping("/")
	public static String main(@RequestParam String color) {
		return "My favorite color is " + color;

	}

}
