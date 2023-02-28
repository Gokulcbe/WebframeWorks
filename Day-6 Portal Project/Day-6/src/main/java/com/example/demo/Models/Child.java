package com.example.demo.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="childdata")
public class Child {
	@Id
	@Column(name="babyid")
	private int Id;
	
	@Column(name="babyfirstname")
	private String fname;

	@Column(name="babylastname")
	private String lname;
	
	@Column(name="fathername")
	private String fathername;
	
	@Column(name="mothername")
	private String mothername;
	
	@Column(name="address")
	private String address;
	
	
	public int getId() {
		return Id;
	}
	
	public void setId(int Id) {
		this.Id = Id;
	}
	
	public String getfName() {
		return fname;
	}
	
	public void setfName(String fname) {
		this.fname = fname;
	}
	
	public String getlName() {
		return lname;
	}
	
	public void setlName(String lname) {
		this.lname = lname;
	}
	
	public String getfatherName() {
		return fathername;
	}
	
	public void setfatherName(String fathername) {
		this.fathername = fathername;
	}
	
	public String getmotherName() {
		return mothername;
	}
	
	public void setmotherName(String mothername) {
		this.mothername = mothername;
	}
	
	public String getaddress() {
		return address;
	}
	
	public void setaddress(String address) {
		this.address = address;
	}
	
	public Child(int Id, String fname, String lname, String fathername, String mothername, String address) {
		super();
		this.Id = Id;
		this.fname = fname;
		this.lname = lname;
		this.fathername = fathername;
		this.mothername = mothername;
		this.address = address;
	}
	
	public Child() {
		
	}


}
