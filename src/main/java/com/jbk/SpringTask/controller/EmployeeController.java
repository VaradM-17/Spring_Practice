package com.jbk.SpringTask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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

	@DeleteMapping("/deletedata/{id}")
	public String deleteData(@PathVariable int id) {
		String msg = employeeservice.deleteData(id);
		return msg;
	}

	@GetMapping("/displayalldata")
	public List<Employee> displayallData() {
		List<Employee> list = employeeservice.displayallData();
		return list;
	}

	@GetMapping("/displaysingledata/{id}")
	public Employee displaysingleData(@PathVariable int id) {
		Employee e = employeeservice.displaysingleData(id);
		return e;
	}

	@GetMapping("/inactive")
	public List<Employee> displayinactive() {
		List<Employee> emp = employeeservice.displayinactive();
		return emp;
	}
	

}
