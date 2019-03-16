package com.gbn.test;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class NativeSql {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		String query = "select * from employee";
		
		
		SQLQuery sqlQuery = session.createSQLQuery(query);
		
		
		List<Object[]> list = sqlQuery.list();
		
		for(Object obj[] : list) {
			System.out.println("eid : "+obj[0]+", ename : "+obj[1]+", esal : "+obj[2]);
		}
		
		session.close();
		factory.close();
	}

}
