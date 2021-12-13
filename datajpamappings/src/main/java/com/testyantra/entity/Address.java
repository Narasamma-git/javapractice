package com.testyantra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address_info")
public class Address {
	 @Column(name="address_id")
	 @Id
	private int addressid;
	 private String city;
	 private String state;
	 @Column(name="contact_id")
	 private int cid;
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Address(int addressid, String city, String state, int cid) {
		super();
		this.addressid = addressid;
		this.city = city;
		this.state = state;
		this.cid = cid;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", city=" + city + ", state=" + state + ", cid=" + cid + "]";
	}
	 
	 
}