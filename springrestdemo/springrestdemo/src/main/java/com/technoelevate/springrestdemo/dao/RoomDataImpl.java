package com.technoelevate.springrestdemo.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import com.technoelevate.springrestdemo.dto.Room;

@Component
public class RoomDataImpl implements RoomData{
	
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public Room getRoom(int roomNumber) {
		
		RowMapper<Room> rowMapper = new RoomMapRow();
		String query="SELECT * FROM room WHERE room_number=?";
		Room myRoom=template.queryForObject(query,rowMapper,roomNumber);
		return myRoom;
	}

}
