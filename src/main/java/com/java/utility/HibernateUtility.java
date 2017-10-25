package com.java.utility;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility 
{
	private static SessionFactory sessionFactory;

	public static SessionFactory getSession()
	{
		if(sessionFactory==null)
		{
			SessionFactory sf= new Configuration().configure().buildSessionFactory();
					
			return sf;
		}
		return null;
	}	
}
