package com.onebill.contactsystem.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="email_id")
public class Emails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="e_id" ,initialValue =400 )
	private int e_id;
	private String Email_id;
	
	
	//private Contact contacts;

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getEmail_id() {
		return Email_id;
	}

	public void setEmail_id(String email_id) {
		Email_id = email_id;
	}

//	public Contact getContacts() {
//		return contacts;
//	}

//	public void setContacts(Contact contacts) {
//		this.contacts = contacts;
//	}

	public Emails(int e_id, String email_id, Contact contacts) {
		super();
		this.e_id = e_id;
		Email_id = email_id;
		//this.contacts = contacts;
	}

	public Emails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emails [e_id=" + e_id + ", Email_id=" + Email_id + ", contacts=" + "]";
	}

}
