package com.jbk.SpringTask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PutMapping("/updatedata/{id}")
	public String updateData(@RequestBody Employee emp, @PathVariable int id) {
		String msg = employeeservice.updateData(emp, id);
		return msg;
	}
}
