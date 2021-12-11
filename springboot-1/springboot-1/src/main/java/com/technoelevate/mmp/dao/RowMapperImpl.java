package com.technoelevate.mmp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.technoelevate.mmp.dto.Room;

public class RowMapperImpl implements RowMapper<Room> {

	@Override
	public Room mapRow(ResultSet rs, int rowNum) throws SQLException {
		Room room = new Room();
		/*
		 * room.setRoom_number(rs.getInt(1)); room.setBed_type(rs.getString(2));
		 * room.setFans(rs.getString(3)); room.setTable_type(rs.getString(4));
		 * room.setChairs(rs.getString(5)); room.setAc(rs.getString(6));
		 * room.setRent(rs.getDouble(7));
		 */
		return room;
	}

}
