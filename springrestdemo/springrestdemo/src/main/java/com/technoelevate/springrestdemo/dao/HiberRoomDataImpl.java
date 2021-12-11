package com.technoelevate.springrestdemo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.technoelevate.springrestdemo.dto.Room;

@Repository
public class HiberRoomDataImpl implements RoomData{

	@Override
	public Room getRoom(int roomNumber) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("jiggyStay");
	EntityManager manager = factory.createEntityManager();
	Room myRoom = manager.find(Room.class, roomNumber);
	return myRoom;
	}
	

}
