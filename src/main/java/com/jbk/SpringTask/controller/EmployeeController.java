package com.jbk.SpringTask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.SpringTask.entity.Employee;
import com.jbk.SpringTask.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeservice;

	@PostMapping("/insertdata")
	public String insertData(@RequestBody Employee emp) {
		String msg = employeeservice.insertData(emp);
		return msg;
	}
}
