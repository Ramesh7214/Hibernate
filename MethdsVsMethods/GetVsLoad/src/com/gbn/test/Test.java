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
		
		Employee emp = (Employee) session.load(Employee.class, 7); // not hitting database
		System.out.println("hey not yet hitted database");
		
		System.out.println(emp.getEmpSal()); // hitted database, if not found, it throws ObjectNotFoundException
		
		session.clear(); // if we dont clear cache, get will pick object from cache ;)
		
		Employee emp2 =  (Employee) session.get(Employee.class, 7); // hits the database,if not found return null
		System.out.println("retrived from database!");
		
		System.out.println(emp2.getEmpSal());
		
		session.close();
		factory.close();
	
	}

}
