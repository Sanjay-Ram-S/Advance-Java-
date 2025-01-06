package com;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchEmailAndSal {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select e.email,e.sal from Employee e");
		
		List<Object[]> list = q.getResultList();
		
		for(Object arr[] : list) {
			System.out.println("Email = " + arr[0] + " , Sal =" + arr[1]);
		}
	}
}
