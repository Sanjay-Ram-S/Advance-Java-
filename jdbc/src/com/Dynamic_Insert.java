package com;

import java.util.Scanner;
import java.sql.*;

public class Dynamic_Insert {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

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

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db", "root", "root");

			PreparedStatement ps = c.prepareStatement("insert into movies values(?,?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, movieName);
			ps.setString(3, hero);
			ps.setString(4, heroine);
			ps.setString(5, director);
			ps.setDouble(6, collection);

			ps.executeUpdate();

			System.out.println("data saved");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
