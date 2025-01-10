package com;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class AddBankAcc {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		BankAccount b1 = new BankAccount();
		b1.setAccno(238245);
		b1.setBankName("ICICI");
		b1.setBranch("KK Nagar");
		b1.setIfsc("ICICI3473");
		
		Person p = em.find(Person.class, 3);
		
		if(p != null) {
			
			List<BankAccount> l = p.getBankAccounts();
			l.add(b1);
			
			et.begin();
			em.persist(b1);
			em.merge(p);
			et.commit();
			
		}else {
			System.out.println("ID not found");
		}
	}
}
