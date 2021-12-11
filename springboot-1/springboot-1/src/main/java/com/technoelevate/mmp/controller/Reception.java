package com.technoelevate.mmp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.technoelevate.mmp.dto.Room;
import com.technoelevate.mmp.dto.RoomResponse;
import com.technoelevate.mmp.services.HiberRoomServiceImpl;


@RestController
public class Reception {

	@Autowired
	HiberRoomServiceImpl service;
	
	
	@GetMapping(path="/getARoom/{roomNumber}",produces = MediaType.APPLICATION_JSON_VALUE)
	public RoomResponse getARoom(@PathVariable String roomNumber) {
		
		RoomResponse response=new RoomResponse();
		Room room= service.getARoom(Integer.parseInt(roomNumber));
		if(room !=null) {
			response.setMsg("Found the room");
			response.setStatusCode(200);
			response.setDescription("Below are the aminities you will get");
			response.setRoom(room);
			
		}
		else {
			response.setMsg("Not able to find the room");
			response.setStatusCode(404);
			response.setDescription("Sorry! The room you are looking for is either not available or is occupied.");
		   response.setRoom(null);
		}
		return response;
	}

}
