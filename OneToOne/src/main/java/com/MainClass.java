package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		AadharCard a = new AadharCard();
		a.setAno(8437088);
		a.setDob("29/08/1999");
		a.setAddress("vaniyambadi");
		a.setFatherName("saravanan");
		a.setEmail("sanjay@gmail.com");
		
		Person p = new Person();
		p.setId(1);
		p.setName("sanjay");
		p.setGender("male");
		p.setAge(25);
		p.setPhone(9585);
		p.setAadharCard(a);
		
		et.begin();
		em.persist(p);
		em.persist(a);
		et.commit();
		
		System.out.println("Data Saved");
	}
}
