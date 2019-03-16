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
		
		System.out.println("About to insert Record !!");
		
		Employee emp = new Employee();
		emp.setEmpName("Ramesh");
		emp.setEmpSal(100000);
		
		session.beginTransaction();
		session.persist(emp);
		session.beginTransaction().commit();
		
		Employee emp2 = new Employee();
		emp2.setEmpName("sham");
		emp2.setEmpSal(10000);
		
		session.beginTransaction();
		System.out.println("Id : "+session.save(emp2));
		session.beginTransaction().commit();
		
		session.close();
		
		System.out.println("====End======");
		factory.close();
	
	}

}

