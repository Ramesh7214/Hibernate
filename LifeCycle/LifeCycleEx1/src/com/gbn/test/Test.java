package com.gbn.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gbn.model.Employee;

public class Test {

	public static void main(String[] args) {
		
		Configuration config =  new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Employee emp = new Employee(); // Transient state
		emp.setEmpName("gbn");
		emp.setEmpSal(100000);
		
		Transaction t = session.beginTransaction();
		session.save(emp);
		t.commit(); // persistent  state
		System.out.println("Object Saved Succesfully!!");
		
		session.clear(); //clearing cache also detached state
		session.close(); // detatched state
		factory.close();

	
	}

}
