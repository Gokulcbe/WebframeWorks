package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Books;
import com.example.demo.Services.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService ser;
	
	@GetMapping("/getbooks")
	public List<Books> getDetails()
	{
		return ser.getAllDetails();
	}
	
	@GetMapping("/getbooks/{id}")
	public Optional<Books> getDetailsById(@PathVariable int id)
	{
		return ser.getDetailsId(id);
	}
	
	
	@PostMapping("/addbooks")
	public String postDetails(@RequestBody Books e)
	{
		ser.saveDetails(e);
		return "Book Details Added Successfully";
	}
	
	@DeleteMapping("/deletebooks/{id}")
	public String deleteDetails(@PathVariable int id) {
		ser.deleteBooksById(id);
		return "Id Deleted"; 
	}
	
	@PutMapping("/updateBooks/{id}")
	public Books update(@PathVariable int id, @RequestBody Books e) {
		return ser.update(id, e);
	}
	
}
