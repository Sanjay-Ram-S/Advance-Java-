package com;

import java.sql.*;

public class Update {

	public static void main(String[] args) {

		Connection c = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db", "root", "root");

			Statement s = c.createStatement();

			// 4.execute query
			s.executeUpdate("update movies SET collections=300");
			System.out.println("Data Updated");

			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {

			try {

				if (c != null) {

					c.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
