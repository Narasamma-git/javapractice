package com.technoelevate.LifeCycleDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Advance {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Advance [price=" + price + "]";
	}
	@PostConstruct
	public void init() {
		System.out.println("Started");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Ended");
	}
	
	
}
