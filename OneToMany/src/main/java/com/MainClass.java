package com;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		BankAccount b1 = new BankAccount();
		b1.setAccno(5456674);
		b1.setBankName("UnionBank");
		b1.setBranch("arumbakkam");
		b1.setIfsc("UNI0902HG");
		
		BankAccount b2 = new BankAccount();
		b2.setAccno(988652);
		b2.setBankName("IndianBank");
		b2.setBranch("vadapalani");
		b2.setIfsc("IB0902HG");
		
		BankAccount b3 = new BankAccount();
		b3.setAccno(467879);
		b3.setBankName("SBI");
		b3.setBranch("koyambedu");
		b3.setIfsc("SBI0902HG");
		
		List<BankAccount> al = new ArrayList<BankAccount>();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		
		Person p = new Person();
		p.setName("Sanjay");
		p.setGender("Male");
		p.setPhone(9585);
		p.setAddress("Vaniyambadi");
		p.setBankAccounts(al);
		
		et.begin();
		em.persist(p);
		et.commit();
		
		System.out.println("Data Saved");
	}
}
