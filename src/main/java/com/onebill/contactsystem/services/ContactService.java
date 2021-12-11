package com.onebill.contactsystem.services;

import java.util.List;

import com.onebill.contactsystem.entities.Contact;

public interface ContactService {
	
	public List<Contact> getContacts();
	public Contact getContact(int id);
	public Contact addContact(Contact contact);
	public Contact updateContact(Contact contact);
	public String deleteContact(int parseInt);

}
