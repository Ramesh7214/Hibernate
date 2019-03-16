package com.gbn.test;

import java.util.HashSet;
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
		
		System.out.println("About to Insert Record !!");
		
		Department dept = new Department();
		dept.setDeptName("Development");
		
		Employee emp1 = new Employee();
		emp1.setEmpName("Ramesh");
		
		Employee emp2 = new Employee();
		emp2.setEmpName("Robin");
		
		Set<Employee> employeeSet = new HashSet<Employee>();
		
		employeeSet.add(emp1);
		employeeSet.add(emp2);
		
		dept.setEmployees(employeeSet);
		
		session.beginTransaction();
		session.save(dept);
		session.beginTransaction().commit();
		
		System.out.println("========END=========");
		
		session.close();
		factory.close();
		
		// found more update statements in the console. because of cascade="all"
	
	}

}
