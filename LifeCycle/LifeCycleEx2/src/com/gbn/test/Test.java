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
		
		Session session1 = factory.openSession();
		
		Employee emp = new Employee(); // Transient state
		emp.setEmpName("gbn");
		emp.setEmpSal(100000);
		
		Transaction t1 = session1.beginTransaction();
		session1.save(emp);
		t1.commit(); // persistent  state
		System.out.println("Object Saved Succesfully!!");
		
		//session1.clear(); //clearing cache also detached state
		session1.close(); // detatched state
		
		emp.setEmpName("suresh"); // it is in detatched state
		
		Session session2 = factory.openSession();
		Transaction t2 = session2.beginTransaction();
		
		session2.update(emp); // Persistant state
		t2.commit();
		
		session2.close();
		
		factory.close();

	}

}
