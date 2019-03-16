package com.gbn.test;

import java.util.Set;

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
		
		System.out.println("About to fetch Record !!");
		Department dept = (Department) session.get(Department.class, 1);
		
		System.out.println(dept.getDeptName());
		
		Set<Employee> emp = dept.getEmployees();
		
		System.out.println(emp);
		
		
		System.out.println("========END=========");
		
		session.close();
		factory.close();
		
		// found more update statements in the console. because of cascade="all"
	
	}

}
