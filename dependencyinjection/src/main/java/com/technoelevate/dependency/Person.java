package com.technoelevate.dependency;

import java.util.List;

public class Person {
	private String name;
	private Address address;
	//private List<Address> address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
//	
//	public List<Address> getAddress() {
//		return address;
//	}
//	public void setAddress(List<Address> address) {
//		this.address = address;
//	}

	
	
public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	//	
//	public Person(String name,List<Address> address) {
//		super();
//		this.name = name;
//		this.address = address;
//	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

	

}
