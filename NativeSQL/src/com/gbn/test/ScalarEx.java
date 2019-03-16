package com.gbn.test;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.DoubleType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

public class ScalarEx {
	
	public static void main(String[] args) {


		Configuration config = new Configuration();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		String query = "select emp_id, emp_name, emp_salary from employee";
		
		
		SQLQuery sqlQuery = session.createSQLQuery(query);
		sqlQuery.addScalar("emp_id", new IntegerType());
		sqlQuery.addScalar("emp_name", new StringType());
		sqlQuery.addScalar("emp_salary", new DoubleType());
		
		
		List<Object[]> list = sqlQuery.list();
		
		for(Object obj[] : list) {
			System.out.println("eid : "+obj[0]+", ename : "+obj[1]+", esal : "+obj[2]);
		}
		
		session.close();
		factory.close();


	}

}
