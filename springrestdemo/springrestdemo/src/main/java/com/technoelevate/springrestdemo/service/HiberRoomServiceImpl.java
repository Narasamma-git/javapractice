package com.technoelevate.springrestdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technoelevate.springrestdemo.dao.HiberRoomDataImpl;
import com.technoelevate.springrestdemo.dto.Room;

@Service
public class HiberRoomServiceImpl implements RoomService {
	
	@Autowired
	HiberRoomDataImpl dao;

	@Override
	public Room getRoom(int roomNumber) {
		return dao.getRoom(roomNumber);
	}

}
