package com.technoelevate.mmp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technoelevate.mmp.dao.HiberRoomDataManagementImpl;
import com.technoelevate.mmp.dto.Room;

@Service
public class HiberRoomServiceImpl implements RoomServices {

	@Autowired
	HiberRoomDataManagementImpl dao;
	
	@Override
	public Room getARoom(int roomNumber) {
		return dao.getARoom(roomNumber);
	}

}
