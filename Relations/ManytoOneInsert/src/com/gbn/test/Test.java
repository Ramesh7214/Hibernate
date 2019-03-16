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
		
		System.out.println("About to insert Record !!");
		
		Department dept = new Department();
		dept.setDeptName("Testing");
		
		Employee emp1 = new Employee();
		emp1.setDept(dept);
		emp1.setEmpName("Subhasis");
		
		Employee emp2 = new Employee();
		emp2.setDept(dept);
		emp2.setEmpName("Chandra");
		
		session.beginTransaction();
		session.save(emp1);
		session.save(emp2);
		session.beginTransaction().commit();
		
		System.out.println("========END=========");
		
		session.close();
		factory.close();
		
		// found more update statements in the console. because of cascade="all"
	
	}

}
