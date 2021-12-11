package com.technoelevate.hibernatedetails;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Tenant {

	@Id
	private int AdharNumber;
	private String name;
	@ManyToOne
	private Room room;

	public Tenant(int adharNumber, String name, Room room) {
		super();
		AdharNumber = adharNumber;
		this.name = name;
		this.room = room;
	}

	public int getAdharNumber() {
		return AdharNumber;
	}

	public void setAdharNumber(int adharNumber) {
		AdharNumber = adharNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Tenant() {
		super();
		// TODO Auto-generated constructor stub
	}


}
