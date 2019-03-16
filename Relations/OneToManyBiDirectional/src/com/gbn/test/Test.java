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
		
		System.out.println("About to insert Record !!");
		
		Department dept = new Department();
		dept.setDeptName("Admin");
		
		Employee emp1 = new Employee();
		emp1.setEmpName("Raj");
		
		Employee emp2 = new Employee();
		emp2.setEmpName("amit");
		
		Employee emp3 = new Employee();
		emp3.setEmpName("karan");
		
		//One -To - Many
		
		Set<Employee> employeeSet = new HashSet<Employee>();
		employeeSet.add(emp1);
		employeeSet.add(emp2);
		employeeSet.add(emp3);
		dept.setEmployees(employeeSet);
		
		//Many - to - One
		
		emp1.setDept(dept);
		emp2.setDept(dept);
		emp3.setDept(dept);
		
		session.beginTransaction();
		session.save(emp3);
		session.beginTransaction().commit();
		
		
		
		
		System.out.println("========END=========");
		
		session.close();
		factory.close();
		
		// found more update statements in the console. because of cascade="all"
	
	}

}
