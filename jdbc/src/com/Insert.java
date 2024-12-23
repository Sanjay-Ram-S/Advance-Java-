package com;

import java.sql.*;

public class Insert {
	
	public static void main(String[] args) {
		
		try {
		// 1.Load or register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2.establish connection
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
		//System.out.println(c);
		
		// 3.create statement
		Statement s=c.createStatement();
		//System.out.println(s);
		
		// 4.execute query
		//s.executeUpdate("insert into movies values(1,'Enthiran','rajni','aishwariya rai','shankar',500)");
		s.executeUpdate("insert into movies values(2,'leo','vijay','trisha','lokesh',500)");
		System.out.println("Data Inserted");
		
		// 5.close the connection
		// by using close() we need to close the connection
		
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
