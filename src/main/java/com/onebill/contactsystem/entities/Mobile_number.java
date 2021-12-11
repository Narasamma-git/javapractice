package com.onebill.contactsystem.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Mobile_number {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="mob_id" ,initialValue =200 )
	private int mob_id;
	private String mob_num;
	
	
	//private Contact contact;

	public int getMob_id() {
		return mob_id;
	}

	public void setMob_id(int mob_id) {
		this.mob_id = mob_id;
	}

	public String getMob_num() {
		return mob_num;
	}

	public void setMob_num(String mob_num) {
		this.mob_num = mob_num;
	}

//	public Contact getContact() {
//		return contact;
//	}
//
//	public void setContact(Contact contact) {
//		this.contact = contact;
//	}

	public Mobile_number(int mob_id, String mob_num, Contact contact) {
		super();
		this.mob_id = mob_id;
		this.mob_num = mob_num;
		//this.contact = contact;
	}

	public Mobile_number() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Mobile_number [mob_id=" + mob_id + ", mob_num=" + mob_num + ", contact=" + "]";
	}
}
