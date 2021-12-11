package com.technoelevate.autow;

public class Student {
	private int regno;
	private String name;
	
	
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int regno, String name) {
		super();
		this.regno = regno;
		this.name = name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [regno=" + regno + ", name=" + name + "]";
	}

}
