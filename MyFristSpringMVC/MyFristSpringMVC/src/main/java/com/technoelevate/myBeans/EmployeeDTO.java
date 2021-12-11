package com.technoelevate.myBeans;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {
	private String empId;
	private String userName;
	private String password;
	public String getEmpId() {
		return empId;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public EmployeeDTO(String empId, String userName, String password) {
		super();
		this.empId = empId;
		this.userName = userName;
		this.password = password;
	}
	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
