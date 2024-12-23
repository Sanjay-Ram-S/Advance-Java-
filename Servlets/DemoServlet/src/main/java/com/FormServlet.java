package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FormServlet extends GenericServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException,ServletException{
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		
		String html = 	"<html>"
				+ 		"<body>"
				+ 		"<h1> ID = "+id+" , NAME = "+name+" </h1>"
				+		"</body>"
				+ 		"</html>";
		
		PrintWriter out = res.getWriter();
		out.print(html);
	}

}
