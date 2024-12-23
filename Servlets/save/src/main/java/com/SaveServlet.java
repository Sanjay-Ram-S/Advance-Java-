package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SaveServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		double sal = Double.parseDouble(req.getParameter("sal"));

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			
			PreparedStatement ps = c.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, gender);
			ps.setDouble(4, sal);

			ps.executeUpdate();

			c.close();
			
			PrintWriter out = res.getWriter();

			out.print("<h1> Data Inserted </h1>");

			

		} catch ( SQLException | ClassNotFoundException e) {

			e.printStackTrace();
		}

	}
}
