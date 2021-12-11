package com.technoelevate.autow;

import java.util.List;

public class Faculty {
	private int id;
	private String name;
	private List<Student> students;
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
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Faculty(int id, String name, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
	}
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", students=" + students + "]";
	}
	
}
