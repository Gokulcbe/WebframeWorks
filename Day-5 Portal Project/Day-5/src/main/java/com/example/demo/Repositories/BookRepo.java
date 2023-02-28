package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Books;

public interface BookRepo extends JpaRepository<Books, Integer>{

}
