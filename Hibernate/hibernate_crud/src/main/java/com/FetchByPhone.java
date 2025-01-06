package com;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchByPhone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Phone Number");
		long phone = sc.nextLong();

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select e from Employee e where e.phone = ?1 ");
		q.setParameter(1, phone);

		Employee e = (Employee) q.getSingleResult();
		System.out.println(e);
	}
}
