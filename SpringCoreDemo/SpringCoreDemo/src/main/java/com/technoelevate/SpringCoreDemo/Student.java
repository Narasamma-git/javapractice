package com.technoelevate.SpringCoreDemo;

public class Student {
	
	private int studentId;
	private String studentName;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("Setting the studentId");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Setting the studentName");
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return this.studentId+" : "+this.studentName;
	}
	
	

}
