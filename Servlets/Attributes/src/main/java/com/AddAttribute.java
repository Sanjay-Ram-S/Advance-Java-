package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addAttribute")
public class AddAttribute extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Student s = new Student(1, "tom", 90);

		ServletContext context = getServletContext();

		context.setAttribute("std", s);

		PrintWriter out = resp.getWriter();
		out.print("<h1> Attributes Added </h1>");
	}
}
