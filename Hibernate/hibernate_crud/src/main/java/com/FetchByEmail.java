package com;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchByEmail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Email");
		String email = sc.next();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		//Query q = em.createQuery("select e from Employee e where e.email='xyz@gmail.com' ");
		Query q = em.createQuery("select e from Employee e where e.email= :e ");
		q.setParameter("e", email);

		Employee e = (Employee) q.getSingleResult();  //downcasting Object o = q.getSingleResult();    Employee e = (Employee) o;

		System.out.println(e);
	}
}
