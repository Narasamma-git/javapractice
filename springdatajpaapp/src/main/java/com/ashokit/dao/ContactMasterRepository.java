package com.ashokit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.Contacts;
@Repository
public interface ContactMasterRepository extends JpaRepository<Contacts, Integer> {
	
	public Contacts findBycontactName(String name);
	//this method will geennerate query like below
	//select * from contacts where contactname='name';
	
	
	
	public Contacts findByContactNameAndNumber(String name,String number);
	

}
