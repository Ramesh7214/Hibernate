package com.gbn.test;

import java.math.BigDecimal;

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
		
		Employee emp = new Employee();
		emp.setEmpName("venkaiah");
		emp.setEmpSal(new BigDecimal("100000"));
		
		Transaction t = session.beginTransaction();
		session.save(emp);
		t.commit();
		System.out.println("Object Saved Succesfully!!");
		
		session.close();
		factory.close();

	}

}
