package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getHttpDemo")
public class HttpDemo extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		PrintWriter out = res.getWriter();

		out.print("<h1> Hi this is POST method </h1>");

	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		PrintWriter out = res.getWriter();

		out.print("<h1> Hi this is GET method </h1>");
		
	}
}
