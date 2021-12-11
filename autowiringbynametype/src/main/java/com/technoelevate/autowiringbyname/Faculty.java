package com.technoelevate.autowiringbyname;

import java.util.List;

public class Faculty {
private int fid;
private String fname;
private List<Student> student;
public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public List<Student> getStudent() {
	return student;
}
public void setStudent(List<Student> student) {
	this.student = student;
}
public Faculty(int fid, String fname, List<Student> student) {
	super();
	this.fid = fid;
	this.fname = fname;
	this.student = student;
}
public Faculty() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Faculty [fid=" + fid + ", fname=" + fname + ", student=" + student + "]";
}
public void getStudentdetails() {
	
}

}
