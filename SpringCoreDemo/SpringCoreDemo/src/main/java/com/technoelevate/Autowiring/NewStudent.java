package com.technoelevate.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class NewStudent {
	
	private String name;
	private int age;
	@Autowired
	@Qualifier("tempAddress")
	private Address permAddress;
	@Autowired
	@Qualifier("privateAddress")
	private Address tempAddress;
	
	private Address privateAddress;

	public void setPrivateAddress(Address privateAddress) {
		this.privateAddress = privateAddress;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public NewStudent(Address permAddress, Address tempAddress) {
		super();
		
		this.permAddress = permAddress;
		this.tempAddress = tempAddress;
	}
	public NewStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "NewStudent [name=" + name + ", age=" + age + ", permAddress=" + permAddress + ", tempAddress="
				+ tempAddress + ", privateAddress=" + privateAddress + "]";
	}
	
}
