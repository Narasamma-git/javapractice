package com.technoelevate.springrestdemo.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("Room-Response")

public class RoomResponse implements Serializable {

	private String msg;
	private int statusCode;
	private String description;
	
	@JsonProperty("room-info")
	private Room room;
	
}
