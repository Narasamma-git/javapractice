package com.technoelevate.springrestdemo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.technoelevate.springrestdemo.dto.Room;

public class RoomMapRow implements RowMapper<Room> {

	@Override
	public Room mapRow(ResultSet rs, int rowNum) throws SQLException {
		Room room = new Room();
		room.setRoomNumber(rs.getInt(1));
		room.setBedType(rs.getString(2));
		room.setFan(rs.getString(3));
		room.setTable(rs.getString(4));
		room.setChairs(rs.getString(5));
		room.setAc(rs.getString(6));
		room.setRent(rs.getDouble(7));
		return room;
	}

}
