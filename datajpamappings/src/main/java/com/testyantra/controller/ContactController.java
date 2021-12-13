package com.testyantra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testyantra.entity.Contact;
import com.testyantra.service.ContactService;

@RestController
public class ContactController {
	@Autowired
	ContactService contactService;
	
/*	@GetMapping("/contact/{firstName}")
	public Contact getByFName(@PathVariable String firstName) {
		return contactService.findByname(firstName);
	}
	
	*/
	@PostMapping("/contact")
public Contact addContact(@RequestBody Contact contact) {
	return contactService.saveOrUpdate(contact);
}	
	
	@GetMapping("/contact/{id}")
public Contact getContactById(@PathVariable int id) {
	return contactService.getById(id);
}	
	
	@GetMapping("/contact")
public List<Contact> getAllContact() {
	return contactService.getAll();
}	
	@PutMapping("/contact")
public Contact updateContact(@RequestBody Contact contact) {
	return contactService.saveOrUpdate(contact);
}	
	
	@DeleteMapping("/contact/{id}")
	public String deleteContact(@PathVariable int id) {
		return contactService.deleteContact(id);
	}
	
	

}
