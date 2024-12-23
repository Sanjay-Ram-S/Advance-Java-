package com;

import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishConnection {

	public static void main(String[] args) {
		try {
			//load or register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2.Establish connection
			DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
			
			System.out.println("connection Established");
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();		}
	}
}
