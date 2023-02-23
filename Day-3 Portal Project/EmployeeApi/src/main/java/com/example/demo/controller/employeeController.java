package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Employee;
import com.example.demo.Service.ApiService;

@RestController
public class employeeController {

	@Autowired
	private ApiService ser;
	
	@GetMapping("/getEmployee")
	public List<Employee> getDetails()
	{
		return ser.getAllDetails();
	}
	
	@PostMapping("/addEmployee")
	public String postDetails(@RequestBody Employee e)
	{
		ser.saveDetails(e);
		return "Employee Details Added Successfully";
	}
	
	
}
