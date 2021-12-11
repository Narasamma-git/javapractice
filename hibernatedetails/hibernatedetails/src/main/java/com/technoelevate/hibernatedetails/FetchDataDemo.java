package com.technoelevate.hibernatedetails;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchDataDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		
		Room room = session.load(Room.class, 102);
		System.out.println(room);
		session.close();
		factory.close();
	}

}
