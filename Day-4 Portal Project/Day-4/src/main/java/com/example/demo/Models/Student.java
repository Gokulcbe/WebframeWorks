package com.example.demo.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentapi")
public class Student {
	@Id
	@Column(name="Id")
	private int id;
	
	@Column(name="StudentName")
	private String studentname;
	
	@Column(name="DepartmentName")
	private String departmentname;
	
	@Column(name="Mailid")
	private String mailid;
	
	public int getId() {
		return id;
	}
	
	public void setId(int Id) {
		this.id = Id;
	}
	
	public String getName() {
		return studentname;
	}
	
	public void setName(String name) {
		this.studentname = name;
	}
	
	public String getDepartmentName() {
		return departmentname;
	}
	
	public void setDepartmentName(String Dname) {
		this.departmentname = Dname;
	}
	
	public String getmail() {
		return mailid;
	}
	
	public void setmail(String mail) {
		this.mailid = mail;
	}
	
	public Student(int Id, String name, String Dname, String mail) {
		super();
		this.id = Id;
		this.studentname = name;
		this.departmentname = Dname;
		this.mailid = mail;
	}
	
	public Student() {
		
	}


}
