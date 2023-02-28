package com.example.demo.Service;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.Models.Child;
import com.example.demo.Repositories.childRepo;

//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;

@Service
public class childService {

	@Autowired
	private childRepo emp;
	
	public Child saveDetails(Child e) 
	{
		return emp.save(e);
	}
	
	public List<Child> getAllDetails()
	{
		
		Pageable paging = PageRequest.of(0, 4);
		Page<Child> pagedResult = emp.findAll(paging);
//		return emp.findAll();
		return pagedResult.toList();
	}
	public void deleteChildById(int id) 
	{
		emp.deleteById(id);
	}
	
	public Child update(int id, Child e)
	{
		return emp.saveAndFlush(e);
	}
	
}
