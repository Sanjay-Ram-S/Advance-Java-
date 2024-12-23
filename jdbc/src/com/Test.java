package com;

public class Test {

	public static void main(String[] args) {
		
		try {
			// 1. Load or register driver
			// 2nd way
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Register sucessfull");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
