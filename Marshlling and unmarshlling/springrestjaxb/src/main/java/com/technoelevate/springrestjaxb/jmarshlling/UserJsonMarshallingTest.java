package com.technoelevate.springrestjaxb.jmarshlling;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.PrettyPrinter;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.technoelevate.springrestjaxb.beans.User;

public class UserJsonMarshallingTest {

	public static void main(String[] args) {
		User user = new User();
		user.setName("Jeigyanshu");
		user.setDob(new Date());
		user.setEmail("Jeigyanshu@gmail.com");
		user.setId(10);
		user.setPwd("Jeigyanshu30");
		
		try {
			ObjectMapper mapper = new ObjectMapper();
			
			mapper.writeValue(new File("JsonUser.json"), user);
			mapper.writeValue(System.out, user);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
