package com.technoelevate.autowiringbyname;

import java.util.Iterator;
import java.util.List;

public class Student {
	private int regno;
	private String name;   
	private String collage;
	private List<Address> address;
	private long mob;
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
	public String getCollage() {
		return collage;
	}
	public void setCollage(String collage) {
		this.collage = collage;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	public Student(int regno, String name, String collage, List<Address> address, long mob) {
		super();
		this.regno = regno;
		this.name = name;
		this.collage = collage;
		this.address = address;
		this.mob = mob;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [regno=" + regno + ", name=" + name + ", collage=" + collage + ", address=" + address + ", mob="
				+ mob + "]";
	}
public void displayAddress() {
	Iterator itr=address.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}

}
