package com.jbk.SpringTask.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.SpringTask.dao.EmployeeDao;
import com.jbk.SpringTask.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao employeedao;

	public String insertData(Employee emp) {

		String msg = employeedao.insertdata(emp);

		if (Objects.isNull(msg)) {
			msg = "Data insertion failed,try again.";
		}
		return msg;
	}
	
}
