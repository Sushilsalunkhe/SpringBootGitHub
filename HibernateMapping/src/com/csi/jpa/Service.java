package com.csi.jpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Service {
	
	private static SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
	
	public static void main(String[] args) {
		
		Session session=factory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Address address=new Address("DIVAN VADA, SGIVALAY", "CHALISGAON", "MAHARASHTRA", "INDIA");
		
		session.save(address);
		
		Customer customer=new Customer("ASHISH", 9096781934L, 646399.99, address);
		
		session.save(customer);
		
		transaction.commit();
		
	}

}
