package com.technoelevate.springdatajpa.roomrepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.technoelevate.springdatajpa.dto.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Integer>{

}
