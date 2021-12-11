package com.technoelevate.springrestdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.technoelevate.springrestdemo.dto.RoomResponse;
import com.technoelevate.springrestdemo.service.HiberRoomServiceImpl;
import com.technoelevate.springrestdemo.service.RoomServiceImpl;

@RestController
public class MyController {

	@Autowired
	HiberRoomServiceImpl service;

	@GetMapping(path = "/getARoom/{roomNumber}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public RoomResponse getARoom(@PathVariable String roomNumber) {
	
		RoomResponse response= new RoomResponse();
		if(service.getRoom(Integer.parseInt(roomNumber))!=null) {
			response.setStatusCode(200);
			response.setMsg("Successful");
			response.setDescription("Found your room. Below is the description:");
			response.setRoom(service.getRoom(Integer.parseInt(roomNumber)));
			return response;
		}else {
		response.setStatusCode(404);
		response.setMsg("Failed");
		response.setDescription("The room you are trying to find might not exist or under renovation!");
		response.setRoom(null);
		return response;
		}
		
	}

}
