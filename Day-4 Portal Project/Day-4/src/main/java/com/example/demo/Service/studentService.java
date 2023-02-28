package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Student;
import com.example.demo.Repositories.StudentRepo;

@Service
public class studentService {

	@Autowired
	private StudentRepo emp;
	
	public Student saveDetails(Student e) 
	{
		return emp.save(e);
	}
	
	public Optional<Student> getDetailsId(int id)
	{
		return emp.findById(id);
	}
	
	public List<Student> getAllDetails()
	{
		return emp.findAll();
	}
	public void deleteStudentById(int id) 
	{
		emp.deleteById(id);
	}
	
	public Student update(int id, Student e)
	{
		return emp.saveAndFlush(e);
	}
}
