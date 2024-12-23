package chaining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		String email = req.getParameter("email");
		String password = req.getParameter("password");

		String exist_email = "tom@gmail.com";
		String exist_password = "1234";

		PrintWriter out = res.getWriter();

		if (email.equals(exist_email)) {
			if (password.equals(exist_password)) {
				RequestDispatcher dispatcher = req.getRequestDispatcher("Home.html");
				dispatcher.forward(req, res);
			} else {
				out.print("<h1 style = 'color : red'> Incorrect password </h1>");
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("Login.html");
				dispatcher.include(req, res);
			}
		} else {
			out.print("<h1 style = 'color : red'> Email not found </h1>");

			RequestDispatcher dispatcher = req.getRequestDispatcher("Login.html");
			dispatcher.include(req, res);
		}
	}
}

			
