package com.excel1.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.excel1.example.repository.ProductRepo;

@SpringBootTest
class ExcelCreation12ApplicationTests {

     @Autowired	
	 private ProductRepo productRepo;
     
     
	@Test
	void contextLoads() {
	}
	
    
	@Test
	public  void testProductRepo() {
		System.out.println("test started");
		
		productRepo.findAll().forEach(product -> System.out.println(product.getDescription()));
		
	}
	   
}
