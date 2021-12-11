package com.technoelevate.springrestjaxb.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Other_info implements Serializable {

	private boolean maritalStatus;
	private long phno;
	private String gender;
	private long aadharNumber;
}
