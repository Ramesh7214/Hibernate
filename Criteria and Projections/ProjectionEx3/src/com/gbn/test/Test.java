package com.gbn.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.gbn.model.Employee;

public class Test {
	
	// problem with multiple projections

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();
		
		Criteria criteria = session.createCriteria(Employee.class);
		
		ProjectionList pl=Projections.projectionList();
        pl.add(Projections.property("empName"));
        pl.add(Projections.property("empSal"));
		
		criteria.setProjection(pl); 
		List list=criteria.list();
		Iterator it=list.iterator();
		 
		while(it.hasNext())
		{
			Object ob[] = (Object[])it.next();
			System.out.println(ob[0]+"--------"+ob[1]);
		}
		session.close();
		factory.close();

	}

}
