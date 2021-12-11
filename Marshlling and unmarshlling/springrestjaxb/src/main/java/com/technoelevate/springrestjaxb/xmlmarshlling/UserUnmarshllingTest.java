package com.technoelevate.springrestjaxb.xmlmarshlling;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.technoelevate.springrestjaxb.beans.User;

public class UserUnmarshllingTest {
	

	public static void main(String[] args) {
		try {

			JAXBContext context = JAXBContext.newInstance(User.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			User user = (User) unmarshaller.unmarshal(new File("user.xml"));
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
