package com.ashokit;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.dao.ContactMasterRepository;
import com.ashokit.entity.Contacts;

@SpringBootApplication
public class SpringdatajpaappApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=	SpringApplication.run(SpringdatajpaappApplication.class, args);
		ContactMasterRepository bean=context.getBean(ContactMasterRepository.class);
		System.out.println(bean.getClass().getName());  
		
		Contacts entity=new Contacts();
		entity.setCid(3);
		entity.setContactName("Manthan");
		entity.setNumber("775521489635");
		bean.save(entity); 
		
		
	/*	Optional<Contacts> obj=bean.findById(3);
		if(obj.isPresent()) {
			System.out.println(obj.get());
		}
		else
			System.out.println("no record found");

		*/
	/*	Iterable<Contacts> entities=bean.findAllById(Arrays.asList(1,2));
		entities.forEach(entity1->{
			System.out.println(entity1);
		});
		*/
	/*	List<Contacts> list=bean.findAll();
		Iterator<Contacts> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		OR
		Iterable<Contacts> entities=bean.findAll();
		entities.forEach(entity1->{
			System.out.println(entity1);
		});
		
		*/
		
//bean.deleteById(3);		
	Contacts con=	bean.findBycontactName("Manthan");
	System.out.println(con);
	
	Contacts con2=bean.findByContactNameAndNumber("Manthan", "775521489635");
	}

}
