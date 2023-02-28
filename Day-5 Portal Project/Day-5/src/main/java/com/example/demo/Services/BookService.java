package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Books;
import com.example.demo.Repositories.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo emp;
	
	public Books saveDetails(Books e) 
	{
		return emp.save(e);
	}
	
	public Optional<Books> getDetailsId(int id)
	{
		return emp.findById(id);
	}
	
	public List<Books> getAllDetails()
	{
		return emp.findAll();
	}
	public void deleteBooksById(int id) 
	{
		emp.deleteById(id);
	}
	
	public Books update(int id, Books e)
	{
		return emp.saveAndFlush(e);
	}
}
