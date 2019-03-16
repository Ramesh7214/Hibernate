package com.gbn.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gbn.model.Cheque;
import com.gbn.model.CreditCard;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		CreditCard c = new CreditCard();

		c.setAmount(25000);
		c.setCardType("MasterCard");

		Cheque c1 = new Cheque();

		c1.setAmount(200);
		c1.setCheckType("AXIS");

		Transaction tx = session.beginTransaction();
		session.save(c);
		session.save(c1);
		tx.commit();
		System.out.println("Object saved successfully.....!!");
		session.close();
		factory.close();

	}

}
