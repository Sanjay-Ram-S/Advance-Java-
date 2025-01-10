package com;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchAllBankAcc {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select b from BankAccount b");

		List<BankAccount> l = q.getResultList();

		for (BankAccount b : l) {
			System.out.println(b);
		}
	}

}
