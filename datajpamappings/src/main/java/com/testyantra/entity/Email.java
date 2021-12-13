package com.testyantra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="email_info")
public class Email {
	@Column(name="email_id")
	@Id
	private int emailid;
	private String emailType;
	private String email;
	@Column(name="contact_id")
	private int cid;
	public int getEmailid() {
		return emailid;
	}
	public void setEmailid(int emailid) {
		this.emailid = emailid;
	}
	public String getEmailType() {
		return emailType;
	}
	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Email(int emailid, String emailType, String email, int cid) {
		super();
		this.emailid = emailid;
		this.emailType = emailType;
		this.email = email;
		this.cid = cid;
	}
	public Email() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Email [emailid=" + emailid + ", emailType=" + emailType + ", email=" + email + ", cid=" + cid + "]";
	}
	
}