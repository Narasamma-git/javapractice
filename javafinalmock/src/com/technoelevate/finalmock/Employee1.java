package com.technoelevate.finalmock;

public class Employee1 {
	int id;
	String name;
	int age;
	
	public Employee1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", age=" + age;
	}

	
}
