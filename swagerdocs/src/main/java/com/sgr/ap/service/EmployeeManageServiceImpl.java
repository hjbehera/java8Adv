package com.sgr.ap.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sgr.ap.beans.Employee;
import com.sgr.ap.dao.EmployeeDao;

public class EmployeeManageServiceImpl implements EmployeeManageService {
	@Autowired
	private EmployeeDao edao;

	@Override
	public String store(Employee employee) {
		
		
		return employee.getEmployyeId();
	}

}
