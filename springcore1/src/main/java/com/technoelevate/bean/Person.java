package com.technoelevate.bean;

public class Person {
	private String name;
	private String job;
private Address address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Person(String name, String job, Address address) {
	super();
	this.name = name;
	this.job = job;
	this.address = address;
}
@Override
public String toString() {
	return "Person [name=" + name + ", job=" + job + ", address=" + address + "]";
}



}
