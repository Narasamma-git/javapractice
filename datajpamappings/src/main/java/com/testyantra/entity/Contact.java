package com.testyantra.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="contact_info")
public class Contact {
@Column(name="contact_id")
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int contactid;
private String firstName;
private String lastName;
private String dob;
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="contact_id")
private List<Address> address;

@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="contact_id")
private List<Phone> phone;

@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="contact_id")
private List<Email> email;

public int getContactid() {
	return contactid;
}

public void setContactid(int contactid) {
	this.contactid = contactid;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public List<Address> getAddress() {
	return address;
}

public void setAddress(List<Address> address) {
	this.address = address;
}

public List<Phone> getPhone() {
	return phone;
}

public void setPhone(List<Phone> phone) {
	this.phone = phone;
}

public List<Email> getEmail() {
	return email;
}

public void setEmail(List<Email> email) {
	this.email = email;
}

public Contact(int contactid, String firstName, String lastName, String dob, List<Address> address, List<Phone> phone,
		List<Email> email) {
	super();
	this.contactid = contactid;
	this.firstName = firstName;
	this.lastName = lastName;
	this.dob = dob;
	this.address = address;
	this.phone = phone;
	this.email = email;
}

public Contact() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Contact [contactid=" + contactid + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
			+ ", address=" + address + ", phone=" + phone + ", email=" + email + "]";
}



	
}
