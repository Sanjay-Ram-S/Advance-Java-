package com;

import java.sql.*;
import java.util.Scanner;

public class FecthAll {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("Enter the movie starting collection");
		double start = sc.nextDouble();
		System.out.println("Enter the movie ending collection");
		double end = sc.nextDouble();
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","root");
			
			PreparedStatement ps = c.prepareStatement("select * from movies where collections between ? and ?");
			ps.setDouble(1, start);
			ps.setDouble(2, end);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				
				System.out.println("id = " + rs.getInt("id"));
				System.out.println("movie_name = " + rs.getString("movie_name"));
				System.out.println("hero = " + rs.getString("hero"));
				System.out.println("heroine = " + rs.getString("heroine"));
				System.out.println("director = " + rs.getString("director"));
				System.out.println("collections = " + rs.getDouble("collections"));
				System.out.println("--------------------------------------");
				
			}
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}
