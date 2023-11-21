package com.excel1.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel1.example.entities.Product;

public interface ProductRepo extends JpaRepository <Product,Long> {
	
	

}
