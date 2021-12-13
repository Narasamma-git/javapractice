package com.testyantra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testyantra.entity.Contact;
import com.testyantra.repository.ContactRepository;

@Service
public class ContactService {
	@Autowired
	ContactRepository contactRepository;
	
	
//	public Contact findByname(String name) {
//		return  contactRepository.findByFirstName(name);
//	}

	public Contact saveOrUpdate(Contact contact) {
		return contactRepository.save(contact);
	}
	
	
	public Contact getById(int id) {
		return contactRepository.getById(id);
	}
	
	public List<Contact> getAll(){
		return contactRepository.findAll();
	}
	
	public String deleteContact(int id) {
		contactRepository.deleteById(id);
		return "Contact deleted successfully";
	}
	
	
	
}
