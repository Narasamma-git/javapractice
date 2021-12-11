package com.technoelevate.hibernatedetails;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	
	public static void main(String[] args) {
		
		Cirtificate certificate = new Cirtificate("Android","2 months");
		Student student = new Student(102,"Anshu","Pune",certificate);
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.save(student);
		transaction.commit();
		session.close();
		factory.close();
		
	}

}
