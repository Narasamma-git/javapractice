package com.technoelevate.springrestdemo.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.sun.xml.bind.CycleRecoverable.Context;
import com.technoelevate.springrestdemo.dao.RoomData;
import com.technoelevate.springrestdemo.dao.RoomDataImpl;
import com.technoelevate.springrestdemo.dto.Room;

@Service("SpringJDBCWay")
public class RoomServiceImpl implements RoomService {

	ApplicationContext context = new ClassPathXmlApplicationContext("com/technoelevate/springrestdemo/service/config.xml");
private	RoomData roomData = context.getBean("myRoomBean",RoomDataImpl.class);
	
	@Override
	public Room getRoom(int roomNumber) {
		Room myRoom = roomData.getRoom(roomNumber);
		return myRoom;
	}

}
