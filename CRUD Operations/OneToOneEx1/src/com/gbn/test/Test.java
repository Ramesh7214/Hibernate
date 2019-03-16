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
		
		Session session = factory.openSession();
		
		System.out.println("About insert Record !!");
		
		Employee emp = new Employee();
		emp.setEmployeeName("Ramesh");
		emp.setEmployeeSal(100000);
		
		Department dept = new Department();
		dept.setDeptName("HR");
		
		emp.setDepartment(dept);
		
		session.beginTransaction();
		session.save(emp);
		session.beginTransaction().commit();
		
		
		
		session.close();
		factory.close();
	
	}

}
