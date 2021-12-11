package com.technoelevate.springrestjaxb.jmarshlling;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.technoelevate.springrestjaxb.beans.User;

public class UserUnmarshallingTest {
	public static void main(String[] args) {
		
		try {
			ObjectMapper mapper = new ObjectMapper();
			User user = (User) mapper.readValue(new File("JsonUser.json"), User.class);
			System.out.println(user);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
