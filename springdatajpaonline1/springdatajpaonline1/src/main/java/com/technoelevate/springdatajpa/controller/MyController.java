package com.technoelevate.springdatajpa.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.technoelevate.springdatajpa.dto.Room;
import com.technoelevate.springdatajpa.dto.RoomResponse;
import com.technoelevate.springdatajpa.roomrepository.RoomRepository;

@RestController
public class MyController {
	
	@Autowired
	RoomRepository repo;
	
	
	@PostMapping(path="/addARoom",produces= {MediaType.APPLICATION_JSON_VALUE,  MediaType.APPLICATION_XML_VALUE}, 
														consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public RoomResponse addRoom(@RequestBody Room room) {
		RoomResponse response = new RoomResponse();
		Room roomInfo =repo.save(room);
		response.setStatusCode(200);
		response.setMsg("Sucessful");
		response.setDescription("Room added sucessfully!");
		return response;
	}
	
	@GetMapping(path="/getMyRoom/{roomNumber}", produces= {MediaType.APPLICATION_JSON_VALUE,  MediaType.APPLICATION_XML_VALUE})
	public RoomResponse getRoom(@PathVariable String roomNumber) {
		RoomResponse response = new RoomResponse();
		
		 Optional<Room> roomInfo = repo.findById(Integer.parseInt(roomNumber));
		 
		 if(roomInfo.get()!=null) {
		 response.setStatusCode(200);
		 response.setMsg("Sucessfull");
		 response.setDescription("Sucessfully found the room. Below are the description:");
		 response.setRoom(roomInfo.get());
		return response;
		 }else {
			 response.setStatusCode(420);
			 response.setMsg("Failed");
			 response.setDescription("The room you are looking might not be available or going under maintenence");
			return response;
		 }
	}
	

}
