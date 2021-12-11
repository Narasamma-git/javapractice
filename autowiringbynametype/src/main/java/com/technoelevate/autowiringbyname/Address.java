package com.technoelevate.autowiringbyname;

public class Address {
	private String street;
	private String city;
	private String district;
	private String State;
	private String country;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address(String street, String city, String district, String state, String country) {
		super();
		this.street = street;
		this.city = city;
		this.district = district;
		State = state;
		this.country = country;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", district=" + district + ", State=" + State
				+ ", country=" + country + "]";
	}

	
	
	
}
