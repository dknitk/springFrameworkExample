package com.kw.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/employee/hello")
	public ResponseEntity<String> hello(){
		
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
