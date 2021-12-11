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
import com.technoelevate.springdatajpa.repository.RoomRepository;

@RestController
public class MyController {
	
	
	@Autowired
	RoomRepository repo;
	
	@PostMapping(path="/addARoom", produces = {MediaType.APPLICATION_JSON_VALUE},
														consumes = {MediaType.APPLICATION_JSON_VALUE})
	public RoomResponse addARoom(@RequestBody Room room) {
		RoomResponse response = new RoomResponse();
		Room  myRoomInfo = repo.save(room);
		response.setStatusCode(200);
		response.setMsg("Sucessfull");
		response.setDescription("Room added sucessfully");
		return response;
	}
	
	@GetMapping(path="/getARoom/{roomNumber}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public RoomResponse getRoom(@PathVariable String roomNumber) {
		RoomResponse response= new RoomResponse();
		Optional<Room> roomData = repo.findById(Integer.parseInt(roomNumber));
		
		if(roomData.get()!=null) {
		response.setStatusCode(200);
		response.setMsg("Sucessfull");
		response.setDescription("Room found successfully. Below are the description:");
		response.setRoom(roomData.get());
		return response;
		}else {
			response.setStatusCode(420);
			response.setMsg("Failed");
			response.setDescription("Unable to find the room. The room you are looking for might not be available or under renovation");
			return response;
		}
		
	}

}
