package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet3")
public class Servlet3 extends HttpServlet {

	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		res.sendRedirect("https://github.com");
	}
}
