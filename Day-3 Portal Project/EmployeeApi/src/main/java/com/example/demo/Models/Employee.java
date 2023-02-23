package com.example.demo.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employeeapi")
public class Employee {
	@Id
	@Column(name="id")
	private int Id;
	
	@Column(name="employee_name")
	private String name;
	
	@Column(name="employee_age")
	private int age;
	
	@Column(name="salary")
	private long sal;
	
	public int getId() {
		return Id;
	}
	
	public void setId(int Id) {
		this.Id = Id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public long getSalary() {
		return sal;
	}
	
	public void setSalary(long sal) {
		this.sal = sal;
	}
	
	public Employee(int Id, String name, int age, long sal) {
		super();
		this.Id = Id;
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	
	public Employee() {
		
	}


}
