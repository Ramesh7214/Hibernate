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
		Employee emp3 = (Employee) session.get(Employee.class, 7); // get the object from database. becuase cache cleared
		Employee emp4 = (Employee) session.get(Employee.class, 7); // gets the object from cache
		session.evict(emp4);
		Employee emp5 = (Employee) session.get(Employee.class, 7); // gets the object from database. because we removed employee from cache
		
		session.close();
		
		Session session2 = factory.openSession();
		Employee emp6 = (Employee) session2.get(Employee.class, 7); // gets the object from database. because it is new session
		session2.close();
		
		factory.close();
	
	}

}
