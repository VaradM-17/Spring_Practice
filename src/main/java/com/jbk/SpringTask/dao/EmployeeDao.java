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

	public String updateData(Employee emp, int id) {

		Session ss = null;
		Transaction tx = null;
		String msg = null;

		try {
			ss = factory.openSession();
			tx = ss.beginTransaction();

			Employee e = ss.get(Employee.class, id);

			e.setId(e.getId());
			e.setName(e.getName());
			e.setPhoneno(e.getPhoneno());
			e.setDepartmentit(e.getDepartmentit());
			e.setStatus(e.getStatus());
			e.setCreateddtm(e.getCreateddtm());
			e.setCreatedby(e.getCreatedby());
			e.setUpdateddtm(e.getUpdateddtm());
			e.setUpdatedby(e.getUpdatedby());
			e.setCid(e.getCid());

			ss.merge(e);
			tx.commit();
			msg = "Data Successfully Updated...";

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
	

	
	public String deleteData(int id) {

		Session ss = null;
		Transaction tx = null;
		String msg = null;

		try {
			ss = factory.openSession();
			tx = ss.beginTransaction();

			Employee emp = ss.get(Employee.class, id);

			ss.remove(emp);
			tx.commit();

			msg = "Data Successfully Deleted...";

		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}

		} finally {
			if (ss != null) {
				ss.close();
			}
		}

		return msg;
	}
	
	
	
}
