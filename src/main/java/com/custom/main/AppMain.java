package com.custom.main;

import java.io.IOException;

import com.custom.model.User;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AppMain {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapperObject = new ObjectMapper();
		String str = "{\"name\":\"Andy\",\"dob\":\"2018-01-01\"}";
		
		User user = mapperObject.readValue(str, User.class);
		
		System.out.println(user);
		
		String s = mapperObject.writeValueAsString(user);
		System.out.println(s);
	}
}
