package com;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteBankAcc {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		BankAccount b = em.find(BankAccount.class, 238245);
		
		Person p = em.find(Person.class, 3);
		
		List<BankAccount> list = p.getBankAccounts();
		list.remove(b);
				
		et.begin();
		em.merge(p);
		em.remove(b);
		et.commit();
		
		System.out.println("Data removed from the Bank");
	}
}
