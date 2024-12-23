package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/removeAttribute")
public class DeleteAttribute extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletContext context = getServletContext();

		context.removeAttribute("std");

		PrintWriter out = resp.getWriter();
		out.print("<h1> Attributes Deleted</h1>");
	}
}
