package com.java.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.java.model.Address;
import com.java.model.Baby;

public class RunApp {

	public static void main(String[] args) {
		Baby user = new Baby();
		Address address = new Address();
		address.setCity("Sambalpur");
		address.setPincode(768004l);
		address.setCountry("Kosal");
	
		
		user.setColour("Red");
		user.setId(44);
		user.setName("Abhilash");
		user.setAddress(address);

		Session session=new Configuration().configure().addAnnotatedClass(Baby.class).buildSessionFactory().openSession();

		Transaction ts = session.beginTransaction();
		 session.save(user);
		ts.commit();
		
	}

}
