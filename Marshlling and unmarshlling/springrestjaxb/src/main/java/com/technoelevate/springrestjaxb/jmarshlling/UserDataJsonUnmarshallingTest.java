package com.technoelevate.springrestjaxb.jmarshlling;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.codehaus.jackson.map.ObjectMapper;

import com.technoelevate.springrestjaxb.beans.UserData;

public class UserDataJsonUnmarshallingTest {

	public static void main(String[] args) throws JAXBException {

		try {
			ObjectMapper object = new ObjectMapper();
			UserData newUserData=object.readValue(new File("UserDataJson.json"), UserData.class);
			System.out.println(newUserData);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
