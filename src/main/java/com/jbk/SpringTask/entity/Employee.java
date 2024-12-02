package com.jbk.SpringTask.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private String phoneno;
	private String departmentit;
	@Column(name = "status")
	private String status;
	private String createddtm;
	private String createdby;
	private String updateddtm;
	private String updatedby;
	private int cid;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String phoneno, String departmentit, String status, String createddtm,
			String createdby, String updateddtm, String updatedby, int cid) {
		super();
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
		this.departmentit = departmentit;
		this.status = status;
		this.createddtm = createddtm;
		this.createdby = createdby;
		this.updateddtm = updateddtm;
		this.updatedby = updatedby;
		this.cid = cid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getDepartmentit() {
		return departmentit;
	}

	public void setDepartmentit(String departmentit) {
		this.departmentit = departmentit;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreateddtm() {
		return createddtm;
	}

	public void setCreateddtm(String createddtm) {
		this.createddtm = createddtm;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getUpdateddtm() {
		return updateddtm;
	}

	public void setUpdateddtm(String updateddtm) {
		this.updateddtm = updateddtm;
	}

	public String getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phoneno=" + phoneno + ", departmentit=" + departmentit
				+ ", status=" + status + ", createddtm=" + createddtm + ", createdby=" + createdby + ", updateddtm="
				+ updateddtm + ", updatedby=" + updatedby + ", cid=" + cid + "]";
	}

}
