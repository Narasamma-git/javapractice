package com.technoelevate.springrestjaxb.xmlmarshlling;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.technoelevate.springrestjaxb.beans.UserData;

public class UserDataUnmarshallingTest {

	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext.newInstance(UserData.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			UserData userData = (UserData) unmarshaller.unmarshal(new File("OtherInfo.xml"));
			System.out.println(userData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
