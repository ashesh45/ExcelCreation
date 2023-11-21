package com.excel1.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excel1.example.service.ExcelService;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ExcelService service;
     
	@RequestMapping("/excel")
	public ResponseEntity<Resource> download(){
		
		String filename="products.xlsx";
		 ByteArrayInputStream actualData  =service.getActualData();
		InputStreamResource file=new InputStreamResource(actualData);
		
		ResponseEntity<Resource> body = ResponseEntity.ok()
               .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename="+filename)
               	.contentType(MediaType.parseMediaType("application/vnd.ms-excel"))	
                .body(file);
		
		
                return body;
	}
	
	

}
