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
		
		Employee emp = (Employee) session.load(Employee.class, 7);
		//Employee emp =  (Employee) session.get(Employee.class, 7);
		
		System.out.println(emp);
		
		session.close();
		factory.close();
	
	}

}
