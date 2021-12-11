package com.technoelevate.hibernatedetails;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

		System.out.println("Hello World!");

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		System.out.println(factory);

		Tenant messi = new Tenant();
		Tenant ronaldo = new Tenant();
		List<Tenant> tenants = new ArrayList<Tenant>();
		tenants.add(messi);
		tenants.add(ronaldo);
		Room room101 = new Room(101, "King Size", "Celling", "Wooden Table", "Ergonomics", "Samsung", 15000, tenants);
		messi.setAdharNumber(30);
		messi.setName("Messi");
		messi.setRoom(room101);

		ronaldo.setAdharNumber(7);
		ronaldo.setName("Ronaldo");
		ronaldo.setRoom(room101);

		Session session = factory.openSession();

		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.save(room101);
		session.save(messi);
		session.save(ronaldo);
		transaction.commit();

		/*
		 * Room roomNumber101 = session.get(Room.class, 101);
		 * System.out.println(roomNumber101);
		 * System.out.println("Below are the tenants in room no: "+roomNumber101.
		 * getRoom_number()); for (Tenant tenant : roomNumber101.getTenants()) {
		 * System.out.println(tenant.getName()); }
		 */

		session.close();
		factory.close();
	}
}
