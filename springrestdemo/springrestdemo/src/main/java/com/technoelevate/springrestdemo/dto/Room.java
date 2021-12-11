package com.technoelevate.springrestdemo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@Entity
@Table(name="room")
@XmlRootElement(name = "myroominxml")
@JsonRootName("myroominjson")
public class Room {

	@Id
	@Column(name="room_number")
	private int roomNumber;
	@Column(name="bed_type")
	private String bedType;
	@Column(name="fans")
	private String fan;
	@Column(name="table_type")
	private String table;
	private String chairs;
	private String ac; 
	private double rent;
	
}
