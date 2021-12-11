package com.technoelevate.springrestjaxb.jmarshlling;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import com.technoelevate.springrestjaxb.beans.Address;
import com.technoelevate.springrestjaxb.beans.Other_info;
import com.technoelevate.springrestjaxb.beans.UserData;

public class UserDataMarshallingTest {
	public static void main(String[] args) {

		Other_info info = new Other_info();
		info.setAadharNumber(222192934);
		info.setGender("Male");
		info.setMaritalStatus(true);
		info.setPhno(939219283);

		Address address1 = new Address();
		address1.setCountry("India");
		address1.setHouseNo(30);
		address1.setLandmark("The Banglore Hospital");
		address1.setState("Karnataka");
		address1.setStreet("South End Circle");

		Address address2 = new Address();
		address1.setCountry("India");
		address1.setHouseNo(30);
		address1.setLandmark("Carmel School");
		address1.setState("Odisha");
		address1.setStreet("Narayani Temple Street");

		List<Address> addresses = new ArrayList<Address>();
		addresses.add(address1);
		addresses.add(address2);

		UserData userData = new UserData();
		userData.setName("Jeigyanshu");
		userData.setEmail("Jeigyanshu.Sarangi@gmail.com");
		userData.setId(19);
		userData.setDob(new Date());
		userData.setPassword("Jeigyanshu30");
		userData.setInfo(info);
		userData.setAddress(addresses);
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(new File("UserDataJson.json"), userData);
			mapper.writeValue(System.out, userData);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
