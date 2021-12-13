package com.testyantra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="phone_info")
public class Phone {
	@Column(name="phone_id")
	@Id
	private int phoneid;
	private String phoneType;
	private String phoneNumber;
	@Column(name="contact_id")
	public int cid;
	public int getPhoneid() {
		return phoneid;
	}
	public void setPhoneid(int phoneid) {
		this.phoneid = phoneid;
	}
	public String getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Phone(int phoneid, String phoneType, String phoneNumber, int cid) {
		super();
		this.phoneid = phoneid;
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
		this.cid = cid;
	}
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Phone [phoneid=" + phoneid + ", phoneType=" + phoneType + ", phoneNumber=" + phoneNumber + ", cid="
				+ cid + "]";
	}
	
	
	

}
