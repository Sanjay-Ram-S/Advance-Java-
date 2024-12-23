package com;

import java.sql.*;

public class Demo {
	
	public static void main(String[] args) {
		try {
			// 1.Load or Register Driver
			// explicit
			// 1st way
			
			java.sql.Driver d= new com.mysql.cj.jdbc.Driver();
			
			DriverManager.registerDriver(d);
			
			System.out.println("Load or Register Driver is sucessfull");
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}

}
