package com.technoelevate.springdi;

import java.util.List;

public class Man {
	private String name;
	private int age;
	private List<Mobile> mob;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Mobile> getMob() {
		return mob;
	}
	public void setMob(List<Mobile> mob) {
		this.mob = mob;
	}
	public Man() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Man(String name, int age, List<Mobile> mob) {
		super();
		this.name = name;
		this.age = age;
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Man [name=" + name + ", age=" + age + ", mob=" + mob + "]";
	}
	
}
