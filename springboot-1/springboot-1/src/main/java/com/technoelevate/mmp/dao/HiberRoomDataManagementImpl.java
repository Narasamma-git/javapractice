package com.technoelevate.mmp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.technoelevate.mmp.dto.Room;

@Repository
public class HiberRoomDataManagementImpl implements RoomDataManagement {

	@Override
	public Room getARoom(int roomNumber) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("majesticParadise");
		EntityManager manager = factory.createEntityManager();
		return manager.find(Room.class, roomNumber);
	}

}
