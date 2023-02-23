package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Employee;
import com.example.demo.Repositories.EmployeeRepo;

@Service
public class ApiService {

	@Autowired
	private EmployeeRepo emp;
	
	public Employee saveDetails(Employee e) 
	{
		return emp.save(e);
	}
	
	public List<Employee> getAllDetails()
	{
		return emp.findAll();
	}
	public void deleteDepartmentById(int id) 
	{
		emp.deleteById(id);
	}
	
}
