package com.gbn.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

import com.gbn.model.Employee;

public class Test {
	
	// problem with multiple projections

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();
		
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.setProjection(Projections.property("empName")); 
		criteria.setProjection(Projections.property("empSal")); 
		List<Integer> l=criteria.list();
		for(Integer emp : l)
		{
		System.out.println(emp);
		}
		session.close();
		factory.close();

	}

}
