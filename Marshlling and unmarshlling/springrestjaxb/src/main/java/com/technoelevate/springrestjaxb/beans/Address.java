package com.technoelevate.springrestjaxb.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Address implements Serializable{
	private int houseNo;
	private String street;
	private String landmark;
	private String state;
	private String country;
}
