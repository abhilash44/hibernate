package com.java.main;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import com.java.model.EmployeeDetails;
import com.java.utility.HibernateUtility;

public class RunApp 
{
	public static void  getEmployee(SessionFactory sf)
	{
		try(Session session = sf.openSession()) 
		{
			session.beginTransaction();
			String HQL="From EmployeeDetails";
			Query<EmployeeDetails> q=session.createQuery(HQL,EmployeeDetails.class);
			List<EmployeeDetails> list=q.list();
			for(EmployeeDetails e:list)
			{
				System.out.println(e );
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void  getEmployeeByid(SessionFactory sf,String mobNumber)
	{
		try(Session session = sf.openSession()) 
		{
			session.beginTransaction();
			String HQL="select salary,empAddress from EmployeeDetails";
			Query<Object[]> q=session.createQuery(HQL);
			List<Object[]> list=q.list();
			for(Object[] o:list)
			{
				Long salary=(Long)o[0];
				String empAddress=(String)o[1];

				System.out.println(salary +" " + empAddress);
			}
		} catch (HibernateException e)
		{
			e.printStackTrace();
		}
	}
	public static void  updateEmployeeByid(SessionFactory sf,int id,String mobNumber)
	{
		try(Session session = sf.openSession()) 
		{
			
			String HQL="update EmployeeDetails set mobNumber=:mob where id=:id";
			Query q=session.createQuery(HQL);
			q.setParameter("mob", mobNumber);
			q.setParameter("id", id);
			session.beginTransaction();
			int i=q.executeUpdate();
			if(i>0)
			{
				System.out.println("Updated sucessfully");
			}
			session.getTransaction().commit();
		} catch (HibernateException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		SessionFactory sf= HibernateUtility.getSession(); 
		//RunApp.getEmployee(sf);
		RunApp.updateEmployeeByid(sf,2, "8593775559");
	}


}
