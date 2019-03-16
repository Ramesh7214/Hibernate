package com.gbn.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gbn.model.Products;

public class Test {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory();

		//1) insert composite key
		
		/*Session session = factory.openSession();
		
		Products product = new Products();
		product.setId(1);
		product.setPrice(20000);
		product.setProductName("Washing mechine");

		Transaction t = session.beginTransaction();
		session.save(product);
		t.commit();
		System.out.println("Object Saved Succesfully!!");

		session.close();*/
		
		//2) select using composite key
		
       Session session = factory.openSession();
		
		Products product = new Products();
		product.setId(1);
		product.setProductName("Washing mechine");

		Products prod = (Products) session.get(Products.class, product);
		System.out.println(prod);
		session.close();
		
		
		
		
		
		factory.close();

	}

}
