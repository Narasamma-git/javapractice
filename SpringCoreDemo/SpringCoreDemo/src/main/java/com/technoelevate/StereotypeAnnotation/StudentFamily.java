package com.technoelevate.StereotypeAnnotation;

import java.util.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Spidy")
public class StudentFamily {

	@Value("Sekhar Parker")
	private String name;

	@Value("Marvel Street, BTM layout 2")
	private String address;

	@Value("#{StudentMobileNumbers}")
	private List mobileNumbers;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setMobileNumbers(List mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}

	@Override
	public String toString() {
		return "StudentFamily [name=" + name + ", address=" + address + ", mobileNumbers=" + mobileNumbers + "]";
	}

}
