package com.gbn.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gbn.model.Employee;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Employee emp = (Employee) session.load(Employee.class, 9);
		
		emp.setEmpName("venkat");
		
		Transaction t = session.beginTransaction();
		
		session.update(emp);
		
		t.commit();
		
		System.out.println("Record updated Successfully!!");
		
		session.close();
		factory.close();
		
		
	}

}
