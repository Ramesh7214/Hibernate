package com.gbn.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gbn.model.Department;
import com.gbn.model.Employee;

public class Test {

	public static void main(String[] args) {
		
		Configuration config =  new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		
		
		// insert
		Session session = factory.openSession();
		
		System.out.println("About to Delete Record !!");
		
		Employee emp =(Employee)session.get(Employee.class, 1);
		
		session.beginTransaction();
		
		// if parent has more than one child, then we will get exception
		//else parent and child both will get deleted
		session.delete(emp);
		session.beginTransaction().commit();
		
		System.out.println("========END=========");
		
		session.close();
		factory.close();
		
		// found more update statements in the console. because of cascade="all"
	
	}

}
