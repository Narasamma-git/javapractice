package com.technoelevate.PureAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Student {
	
	@Autowired
	Address address;
	
	
	public Address getMyAddress() {
		return this.address;
	}
	
	public void study() {
		System.out.println("Always Dreaming");
	}
}
