package com.technoelevate.springrestjaxb.beans;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UserData {

	@XmlElement
	private int id;
	@XmlElement
	private String name;
	@XmlElement
	private String email;
	@XmlElement
	private Date dob;
	@XmlTransient
	private String password;
	@XmlElementWrapper(name="Address-Info")
	private List<Address> address;
	@XmlElement
	private Other_info info;
	
}
