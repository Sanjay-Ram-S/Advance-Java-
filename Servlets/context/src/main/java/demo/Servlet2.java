package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2  extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException{
		
		PrintWriter out = res.getWriter();
		
		out.print("<h1> Welcome to servlet2 </h1>");
	} 
}
