package com.technoelevate.mmp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;


@Entity
@Table
@JsonRootName(value = "RoomInfo")
public class Room {
	
	@Id
	private int room_number;
	private String ac;
	private String bed_type;
	private String chairs;
	private String fans;
	private double rent;
	private String table_type;
	public int getRoom_number() {
		return room_number;
	}
	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getBed_type() {
		return bed_type;
	}
	public void setBed_type(String bed_type) {
		this.bed_type = bed_type;
	}
	public String getChairs() {
		return chairs;
	}
	public void setChairs(String chairs) {
		this.chairs = chairs;
	}
	public String getFans() {
		return fans;
	}
	public void setFans(String fans) {
		this.fans = fans;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public String getTable_type() {
		return table_type;
	}
	public void setTable_type(String table_type) {
		this.table_type = table_type;
	}
	public Room(int room_number, String ac, String bed_type, String chairs, String fans, double rent,
			String table_type) {
		super();
		this.room_number = room_number;
		this.ac = ac;
		this.bed_type = bed_type;
		this.chairs = chairs;
		this.fans = fans;
		this.rent = rent;
		this.table_type = table_type;
	}
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Room [room_number=" + room_number + ", ac=" + ac + ", bed_type=" + bed_type + ", chairs=" + chairs
				+ ", fans=" + fans + ", rent=" + rent + ", table_type=" + table_type + "]";
	}
	
	
	
	
	
}
