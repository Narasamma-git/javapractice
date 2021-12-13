package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact_master")
public class Contacts {
	@Id
	@Column(name="cid")
	private int cid;
	
	@Column(name="contact_name")
	private String contactName;
	
	@Column(name="number")
	private String number;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Contacts(int cid, String contactName, String number) {
		super();
		this.cid = cid;
		this.contactName = contactName;
		this.number = number;
	}
	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Contacts [cid=" + cid + ", contactName=" + contactName + ", number=" + number + "]";
	}
	
	
	
	
	
	
	

}
