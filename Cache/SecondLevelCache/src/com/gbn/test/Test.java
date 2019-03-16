package com.gbn.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gbn.model.Employee;

public class Test {

	public static void main(String[] args) {
		
		Configuration config =  new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		System.out.println("About fetch Record !!");
		
		Employee emp1 = (Employee) session.get(Employee.class, 7);// gets the object from database
		Employee emp2 = (Employee) session.get(Employee.class, 7); // gets the object from cache
		session.clear(); // clearing cache
		Employee emp3 = (Employee) session.get(Employee.class, 7); // get the object from global cache.
		session.close();
		
		Session session2 = factory.openSession();
		Employee emp4 = (Employee) session2.get(Employee.class, 7);// gets the object global cache
		session2.close();
		
		try{
			Thread.sleep(6000); // check echcache, timeToIdleSeconds is 5 seconds. so after 6 seconds emplyee will remove from global cache
		}
		catch (Exception e) {
		}		
		
		Session session3 = factory.openSession();
		Employee emp5 = (Employee) session3.get(Employee.class, 7);// gets the object from database. because it request after 6 seconds
		session3.close();
		
		System.out.println("=======END=====");
		
		
		factory.close();
	
	}

}
