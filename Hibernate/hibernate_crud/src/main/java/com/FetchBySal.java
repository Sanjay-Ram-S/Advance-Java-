package com;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchBySal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting salary");
		double start = sc.nextDouble();
		
		System.out.println("Enter Ending salary");
		double end = sc.nextDouble();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select e from Employee e where e.sal between :start and :end ");
		q.setParameter("start", start);
		q.setParameter("end", end);
		
		List<Employee> l = q.getResultList();
		
		for(Employee e : l) {
			System.out.println(e);
		}
	}
}
