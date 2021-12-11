package com.technoelevate.LifeCycleDemo;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Initializing the price for Samosa");
		this.price = price;
	}

	@Override
	public String toString() {
		return "triconaUphar [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Shopkeeper give me a triconaUphar");
	}
	
	public void destroy() {
		System.out.println("I am sorry thats a burp");
	}
	
}
