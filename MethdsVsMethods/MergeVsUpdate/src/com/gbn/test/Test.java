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
		
		System.out.println("About to fetch Record !!");
		
		Employee emp = (Employee) session.get(Employee.class, 7);
		
		Employee emp2 = new Employee();
		emp2.setEmpId(7);
		emp2.setEmpName("Ramesh");
		emp2.setEmpSal(100000);
		
		session.beginTransaction();
		//session.update(emp2); //fails because already object is associated with same object. so with same identifier need to merge
		session.merge(emp2);
		session.beginTransaction().commit();
		
		session.close();
		
		System.out.println("====End======");
		factory.close();
	
	}

}

