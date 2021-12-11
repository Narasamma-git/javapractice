package com.onebill.contactsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onebill.contactsystem.entities.Contact;

@Repository
public interface ContactDao extends JpaRepository<Contact, Integer> {

}
