package com.technoelevate.springrestjaxb.xmlmarshlling;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.technoelevate.springrestjaxb.beans.Address;
import com.technoelevate.springrestjaxb.beans.Other_info;
import com.technoelevate.springrestjaxb.beans.UserData;

public class UserDataMarshllingTest {

	public static void main(String[] args) {
		Other_info info = new Other_info();
		info.setAadharNumber(123456789);
		info.setGender("Male");
		info.setMaritalStatus(true);
		info.setPhno(1234567890);
		
		
		UserData userData = new UserData();
		userData.setName("Jeigyanshu");
		userData.setDob(new Date());
		userData.setEmail("Jeigyanshu@technoelevate.com");
		userData.setId(30);
		userData.setPassword("Messi30");
		
		
		userData.setInfo(info);
		
		Address address1 = new Address();
		address1.setCountry("India");
		address1.setHouseNo(30);
		address1.setLandmark("The Banglore Hospital");
		address1.setState("Karnataka");
		address1.setStreet("South end circle");
		
		Address address2 = new Address();
		address2.setCountry("India");
		address2.setHouseNo(30);
		address2.setLandmark("Carmel School");
		address1.setState("Odisha");
		address1.setStreet("Narayani Temple Street");
		
		List<Address> addresses = new ArrayList<Address>();
		addresses.add(address1);
		addresses.add(address2);
		
		userData.setAddress(addresses);
		try {
			JAXBContext context = JAXBContext.newInstance(UserData.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(userData, System.out);
			marshaller.marshal(userData, new File("OtherInfo.xml"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
