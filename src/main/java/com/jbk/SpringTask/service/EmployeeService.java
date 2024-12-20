package com.jbk.SpringTask.service;

import java.util.List;
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

	public String updateData(Employee emp, int id) {

		String msg = employeedao.updateData(emp, id);

		if (Objects.isNull(msg)) {
			msg = "Data not updated...";
		}
		return msg;
	}

	public String deleteData(int id) {

		String msg = employeedao.deleteData(id);

		if (Objects.isNull(msg)) {
			msg = "Data not deleted...";
		}
		return msg;
	}

	public List<Employee> displayallData() {
		List<Employee> list = employeedao.displayallData();
		return list;
	}

	public Employee displaysingleData(int id) {
		Employee emp = employeedao.displaysingleData(id);
		return emp;

	}

	public List<Employee> displayinactive() {
		List<Employee> emp = employeedao.displayinactive();
		return emp;
	}

}
