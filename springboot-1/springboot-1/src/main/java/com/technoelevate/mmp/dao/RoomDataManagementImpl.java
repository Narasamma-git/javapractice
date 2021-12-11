package com.technoelevate.mmp.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.technoelevate.mmp.dto.Room;


public class RoomDataManagementImpl implements RoomDataManagement{

	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public Room getARoom(int roomNumber) {
		String query ="SELECT * FROM room WHERE room_number=?";
		Room yourRoom = template.queryForObject(query, new RowMapperImpl(), roomNumber);
		return yourRoom;
	}

}
