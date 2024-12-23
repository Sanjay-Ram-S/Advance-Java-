package com;

import java.sql.*;

public class Delete {

	public static void main(String[] args) {
		
		try {
			// 1.load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2.establish connection
		 	Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
		 	
		 	// 3.create statement
		 	Statement s=c.createStatement();
		 	
		 	// 4.execute query
		 	s.executeUpdate("delete from movies where id=2");
		 	System.out.println("Data Deleted");
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
