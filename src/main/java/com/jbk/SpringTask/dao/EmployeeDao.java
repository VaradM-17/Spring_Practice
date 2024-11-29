package com.jbk.SpringTask.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.SpringTask.entity.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	SessionFactory factory;

	public String insertdata(Employee emp) {
		Session ss = null;
		Transaction tx = null;
		String msg = null;

		try {
			ss = factory.openSession();
			tx = ss.beginTransaction();

			ss.persist(emp);

			tx.commit();
			
			msg = "Data successfully inserted...";
		} catch (Exception e) {

			if (tx != null) {
				tx.rollback();
			}

			e.printStackTrace();
		} finally {
			if (ss != null) {
				ss.close();
			}
		}
		return msg;
	}
}
