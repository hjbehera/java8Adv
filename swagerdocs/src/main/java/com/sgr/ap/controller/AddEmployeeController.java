package com.sgr.ap.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgr.ap.beans.Employee;

@RestController
@RequestMapping(value="/addemp")
public class AddEmployeeController {
	

	public int save(Employee emp) {
		
		
		return 0;
		
	}
	
}
