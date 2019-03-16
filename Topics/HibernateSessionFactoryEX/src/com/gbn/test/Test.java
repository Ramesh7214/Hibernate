package com.gbn.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.gbn.factory.HibernateSessionFactory;
import com.gbn.model.Employee;

public class Test {

	public static void main(String[] args) {
		
		Session session = HibernateSessionFactory.getSession();
		
		Transaction t = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEmpName("Amith");
		emp.setEmpSal(1000);
		
		session.save(emp);
		t.commit();
		
		System.out.println("Object saved to Database!!");
		session.close();

	}

}
