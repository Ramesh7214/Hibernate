package com.gbn.test;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FormulaEx {
	public static void main(String[] args) {


		Configuration config = new Configuration().addAnnotatedClass(com.gbn.test.Employee.class);
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		Employee emp = (Employee) session.load(Employee.class, 3);
		System.out.println(emp.getTotal());
		session.close();
		factory.close();
	
	}

}
