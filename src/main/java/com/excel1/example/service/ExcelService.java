package com.excel1.example.service;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel1.example.entities.Product;
import com.excel1.example.helper.Helper;
import com.excel1.example.repository.ProductRepo;

@Service
public class ExcelService {
	
	
	@Autowired
	private ProductRepo repo;
	
	public ByteArrayInputStream getActualData() {
		List<Product> all=repo.findAll();
		  ByteArrayInputStream byteArrayInputStream=Helper.dataToExcel(all);
		  return byteArrayInputStream;
		
	}

}
