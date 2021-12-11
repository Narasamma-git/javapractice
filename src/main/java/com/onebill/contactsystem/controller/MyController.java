package com.onebill.contactsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onebill.contactsystem.entities.Contact;
import com.onebill.contactsystem.services.ContactService;

@RestController
public class MyController {
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Contact";
	}
	
	//get the contacts
	@GetMapping("/contacts")
	public List<Contact> getContacts(){
		return this.contactService.getContacts();
	}
	
	//get one contact using id
	@GetMapping("/contact/{id}")
	public Contact getContact(@PathVariable String id) {
		return this.contactService.getContact(Integer.parseInt(id));
	}
	
	//add contacts
	@PostMapping("/contacts")
	public Contact addContact(@RequestBody Contact contact) {
		return this.contactService.addContact(contact);
	}
	
	//update contacts
	@PutMapping("/contacts")
	public Contact updateContact(@RequestBody Contact contact) {
		return this.contactService.updateContact(contact);
	}
	
	//delete contacts
	@DeleteMapping("/contacts/{id}")
	public String deleteContact(@PathVariable String id){
		return contactService.deleteContact(Integer.parseInt(id));
	}
}
