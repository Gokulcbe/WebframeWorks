package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Booksapi")
public class Books {
	@Id
	@Column(name="Id")
	private int id;
	
	@Column(name="bookName")
	private String bookname;
	
	@Column(name="Price")
	private float price;
	
	@Column(name="Quantity")
	private int quantity;
	
	@Column(name="AuthorName")
	private String authorname;
	
	public int getId() {
		return id;
	}
	
	public void setId(int Id) {
		this.id = Id;
	}
	
	public String getName() {
		return bookname;
	}
	
	public void setName(String name) {
		this.bookname = name;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getAuthorName() {
		return authorname;
	}
	
	public void setAuthorName(String authorname) {
		this.authorname = authorname;
	}
	
	public Books(int Id, String name, float price, int quantity, String author) {
		super();
		this.id = Id;
		this.bookname = name;
		this.price = price;
		this.quantity = quantity;
		this.authorname = author;
	}
	
	public Books() {
		
	}


}
