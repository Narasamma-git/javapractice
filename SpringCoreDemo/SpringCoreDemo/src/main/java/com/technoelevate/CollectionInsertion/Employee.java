package com.technoelevate.CollectionInsertion;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String empName;
	private int empId;
	private ArrayList<Long> phones;
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setPhones(ArrayList<Long> phones) {
		this.phones = phones;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", phones=" + phones + "]";
	}
	
	
	
}
