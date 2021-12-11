package com.technoelevate.hibernatedetails;

import javax.persistence.Embeddable;

@Embeddable
public class Cirtificate {
	
	private String course;
	private String duration;
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Cirtificate(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	public Cirtificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cirtificate [course=" + course + ", duration=" + duration + "]";
	}
	
	

}
