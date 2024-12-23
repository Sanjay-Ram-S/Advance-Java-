package com;

//import java.util.*;

public class MainClass {

	public static void main(String[] args) {

//		UserDao dao = new UserDao();

//		User u = new User();
//		u.setId(2);
//		u.setFname("MS");
//		u.setLname("Dhoni");
//		u.setGender("male");
//		u.setEmail("dhoni7@gamil.com");
//		u.setPassword("7777");
//	    u.setPhno(1234567890);

//		try {
//			dao.saveUser(u);

//			 User u = dao.getById(1);
//			System.out.println(u);

//			 User u = dao.getByEmail("sanjayramcivil@gamil.com");
//			 System.out.println(u);

//			List<User> l = dao.fetchAll();
//
//			for (User u : l) {
//
//				System.out.println(u);
//			}

//			User u = dao.getById(1);
			
//			System.out.println(u);
			
//			if(u != null) {
			
//				u.setPhno(9585029948l);
				
//				System.out.println(u);
				
//				dao.updateUser(u);
//			}
//			else {
				
//				System.out.println("id is not found");
//			}
			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		UserDao dao = new UserDao(); 
		
		User u = new User();
		u.setPhno(23355453);
		System.out.println(u);
		
		try {
			dao.updateUser(u);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
