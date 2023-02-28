package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Child;
import com.example.demo.Service.childService;

@RestController
public class childController {

	@Autowired
	private childService ser;
	 	
	@GetMapping("/getchild")
	public List<Child> getDetails()
	{
		List<Child> ar = new ArrayList<>();
		return ar = ser.getAllDetails();
//		return ser.getAllDetails();
	}
	
	@PostMapping("/addchild")
	public String postDetails(@RequestBody Child e)
	{
		ser.saveDetails(e);
		return "Child Details Added Successfully";
	}
	
	@DeleteMapping("/deletechild/{id}")
	public String deleteDetails(@PathVariable int id) {
		ser.deleteChildById(id);
		return "Id Deleted"; 
	}
	
	@PutMapping("/updatechild/{id}")
	public Child update(@PathVariable int id, @RequestBody Child e) {
		return ser.update(id, e);
	}
	
}
