package com.technoelevate.springrestjaxb.beans;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;

@Data
@XmlRootElement(name="user-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class User implements Serializable{

	
	@XmlElement(name="userid")
	private int id;
	@XmlElement(name="userName")
	private String name;
	@XmlElement(name="birthdate")
	private Date dob;
	@XmlElement
	private String email;
	@XmlTransient
	private String pwd;
	
}
