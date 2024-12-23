package demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException{
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("servlet2");
		
		dispatcher.forward(req, res);
	}
	
}
