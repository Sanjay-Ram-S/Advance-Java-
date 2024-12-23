package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class StaticServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String html = "<html> <body> <h1> Welcome to Static Servlet</h1> </body> </html>";
		
		PrintWriter out = res.getWriter();
		
		out.print(html);
		
	}
}
