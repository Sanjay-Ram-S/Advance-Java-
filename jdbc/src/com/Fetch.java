package com;

import java.sql.*;

public class Fetch {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db", "root", "root");

			Statement s = c.createStatement();

			ResultSet rs = s.executeQuery("select * from movies");

			while (rs.next()) {

				System.out.println("id = " + rs.getInt("id"));
				System.out.println("movie_name = " + rs.getString("movie_name"));
				System.out.println("hero = " + rs.getString("hero"));
				System.out.println("heroine = " + rs.getString("heroine"));
				System.out.println("director = " + rs.getString("director"));
				System.out.println("collections = " + rs.getDouble("collections"));
				System.out.println("--------------------------------------");

			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
