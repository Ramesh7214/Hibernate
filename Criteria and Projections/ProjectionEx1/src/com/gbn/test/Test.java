package com.gbn.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

import com.gbn.model.Employee;

public class Test {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();
		
		Criteria crit = session.createCriteria(Employee.class);
		crit.setProjection(Projections.property("empName")); 
		List<String> l=crit.list();// it returns list of Strings i.e employee name
		for(String emp : l)
		{
		System.out.println(emp);
		}
		session.close();
		factory.close();

	}

}
