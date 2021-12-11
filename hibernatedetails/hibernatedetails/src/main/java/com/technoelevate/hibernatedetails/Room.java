package com.technoelevate.hibernatedetails;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Room {

	@Id
	private int room_number;
	private String bed_type;
	private String fan;
	private String table_type;
	private String chairs;
	private String ac;
	private int rent;
	
	@OneToMany
	private List<Tenant> tenants;
	public int getRoom_number() {
		return room_number;
	}
	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}
	public String getBed_type() {
		return bed_type;
	}
	public void setBed_type(String bed_type) {
		this.bed_type = bed_type;
	}
	public String getFan() {
		return fan;
	}
	public void setFan(String fan) {
		this.fan = fan;
	}
	public String getTable_type() {
		return table_type;
	}
	public void setTable_type(String table_type) {
		this.table_type = table_type;
	}
	public String getChairs() {
		return chairs;
	}
	public void setChairs(String chairs) {
		this.chairs = chairs;
	}
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public List<Tenant> getTenants() {
		return tenants;
	}
	public void setTenants(List<Tenant> tenants) {
		this.tenants = tenants;
	}
	public Room(int room_number, String bed_type, String fan, String table_type, String chairs, String ac, int rent,
			List<Tenant> tenants) {
		super();
		this.room_number = room_number;
		this.bed_type = bed_type;
		this.fan = fan;
		this.table_type = table_type;
		this.chairs = chairs;
		this.ac = ac;
		this.rent = rent;
		this.tenants = tenants;
	}
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Room [room_number=" + room_number + ", bed_type=" + bed_type + ", fan=" + fan + ", table_type="
				+ table_type + ", chairs=" + chairs + ", ac=" + ac + ", rent=" + rent + "]";
	}
	
	
	

	
}