package com.onebill.contactsystem.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="contacts")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String dob;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Mobile_number> mobile_num ;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Emails> emails ;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public Contact(int id, String name, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}


	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public List<Mobile_number> getMobile_num() {
		return mobile_num;
	}


	public void setMobile_num(List<Mobile_number> mobile_num) {
		this.mobile_num = mobile_num;
	}


	public List<Emails> getEmails() {
		return emails;
	}


	public void setEmails(List<Emails> emails) {
		this.emails = emails;
	}


	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", dob=" + dob + ", mobile_num=" + mobile_num + ", emails="
				+ emails + "]";
	}
	
	
	
	
}
