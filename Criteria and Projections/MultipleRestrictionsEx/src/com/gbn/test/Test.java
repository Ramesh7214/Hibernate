package com.gbn.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.gbn.model.Employee;

public class Test {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();

		System.out.println("About fetch Record !!");
		
		Criteria criteria = session.createCriteria(Employee.class);
		//Criterion criterion = Restrictions.gt("empSal", 10000); // to get greater values
		Criterion criterion = Restrictions.lt("empSal", 10000); // to get lesser values
		//Criterion criterion = Restrictions.eq("empSal", "10000"); // for equal
		criteria.add(criterion);
		criteria.addOrder(Order.asc("empSal")); // to get in Ascending order
		List<Employee> employess = criteria.list();

		for(Employee emp : employess)
		{
			System.out.println(emp);
		}
		session.close();
		factory.close();
	}
}
