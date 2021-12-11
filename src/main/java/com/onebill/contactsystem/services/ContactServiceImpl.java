package com.onebill.contactsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onebill.contactsystem.dao.ContactDao;
import com.onebill.contactsystem.entities.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactDao contactDao;

	//List<Contact> list;

	public ContactServiceImpl() {

//		list = new ArrayList<>();
//		list.add(new Contact(5, "Pushpa", "1984-06-18"));
	}

	@Override
	public List<Contact> getContacts() {
		return contactDao.findAll();
//		return list;
	}

	@Override
	public Contact getContact(int id) {
		
		return contactDao.findById(id).get();
//		Contact c = null;
//		for (Contact contact : list) {
//			if (contact.getId() == id) {
//				c = contact;
//				break;
//			}
//		}
//
//		return c;
	}

	@Override
	public Contact addContact(Contact contact) {
//		list.add(contact);
//		return contact;
		contactDao.save(contact);
		return contact;
	}

	@Override
	public Contact updateContact(Contact contact) {

//		list.forEach(e ->{
//			if(e.getId()==contact.getId()) {
//				e.setName(contact.getName());
//				e.setDob(contact.getDob());
//			}
//		});
//		return contact;
		contactDao.save(contact);
		return contact;
	}

	@Override
	public String deleteContact(int id) {
		//list = this.list.stream().filter(e->e.getId()!=parseInt).collect(Collectors.toList());
		contactDao.deleteById(id);
		return "Product with id=" + id + " is deleted...";
	}

}
