package com.gbn.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gbn.model.Employee;

public class Test {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();

		System.out.println("About fetch Record !!");
		
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> employess = criteria.list();

		for(Employee emp : employess)
		{
			System.out.println(emp);
		}
		session.close();
		factory.close();
	}
}
