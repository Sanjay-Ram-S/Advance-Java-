package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(4);
		e.setName("star");
		e.setEmail("star@gmail.com");
		e.setSal(18000);
		e.setPhone(989999);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.persist(e);
		et.commit();

		System.out.println("Data Saved");
	}

}
