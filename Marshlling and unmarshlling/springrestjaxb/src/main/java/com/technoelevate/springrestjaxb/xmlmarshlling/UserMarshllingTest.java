package com.technoelevate.springrestjaxb.xmlmarshlling;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.technoelevate.springrestjaxb.beans.User;

public class UserMarshllingTest { 

	public static void main(String[] args) {
		User user = new User();
		user.setDob(new Date());
		user.setEmail("jeigyanshu@technoelevate.com");
		user.setId(100);
		user.setName("Jeigyanshu");
		user.setPwd("Jeigyanshu@30");
		
		
		try {
				JAXBContext context = JAXBContext.newInstance(User.class);
				Marshaller marshaller= context.createMarshaller();
				marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				marshaller.marshal(user, System.out);
				marshaller.marshal(user, new File("user.xml"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
