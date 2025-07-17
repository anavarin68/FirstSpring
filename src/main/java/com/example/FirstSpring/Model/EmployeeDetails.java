package com.example.FirstSpring.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeDetails {
	
	@Id
	@Column
	private Integer eid;
	@Column
	private String ename;
	@Column
	private String edepartment;
	
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdepartment() {
		return edepartment;
	}
	public void setEdepartment(String edepartment) {
		this.edepartment = edepartment;
	}
	public EmployeeDetails(Integer eid, String ename, String edepartment) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edepartment = edepartment;
	}
	
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
