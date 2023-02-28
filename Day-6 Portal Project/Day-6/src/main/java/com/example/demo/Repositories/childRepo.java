package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Child;

public interface childRepo extends JpaRepository<Child, Integer>{

}
