package com;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifeCycle extends GenericServlet {

	@Override
	public void init() {
		System.out.println("Hi this is init method");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Hi this is service method");
	}
	
	@Override
	public void destroy() {
		System.out.println("Hi this is destroy method");
	}

}
