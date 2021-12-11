package com.technoelevate.PureAnnotation;

import org.springframework.stereotype.Component;

public class Address {
	private String street;
	
	public void myAddress() {
		System.out.println("I stay in Aditya PG. Please vist if you have courage!!!");
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	

}
