package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Product_Insert {

	public static void main(String[] args) {
		Product p = new Product();
		p.setId(2);
		p.setProduct_name("mobile");
		p.setQuantity(5);
		p.setPrice(60000);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(p);
		et.commit();
		
		System.out.println("Data Saved");
	}
}
