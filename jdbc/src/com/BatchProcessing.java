package com;

import java.sql.*;
import java.util.Scanner;

public class BatchProcessing {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Connection c = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
			
			System.out.println("Enter count");
			int count = s.nextInt();
			
			PreparedStatement ps = c.prepareStatement("insert into movies values(?,?,?,?,?,?)");
			
			for(int i = 1; i<=count; i++) {
				System.out.println("Enter the id");
				int id = s.nextInt();

				System.out.println("Enter the movie name");
				String movieName = s.next();

				System.out.println("Enter the hero name");
				String hero = s.next();

				System.out.println("Enter the heroine name");
				String heroine = s.next();

				System.out.println("Enter the director name");
				String director = s.next();

				System.out.println("Enter the collection");
				double collection = s.nextDouble();
				
				ps.setInt(1, id);
				ps.setString(2, movieName);
				ps.setString(3, hero);
				ps.setString(4, heroine);
				ps.setString(5, director);
				ps.setDouble(6, collection);
				
				
				ps.addBatch();
			}
			
			ps.executeBatch();
			
			System.out.println("Data inserted");
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(c != null ) {
					c.close();
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
