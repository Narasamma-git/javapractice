package com.technoelevate.springdi;

public class Mobile {
	private int price;      
	private String brand;
	private String color;
	public Mobile(int price, String brand, String color) {
		super();
		this.price = price;
		this.brand = brand;
		this.color = color;
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Mobile [price=" + price + ", brand=" + brand + ", color=" + color + "]";
	}
	

}
