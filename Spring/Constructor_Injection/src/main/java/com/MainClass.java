package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("stdConfig.xml");
		
		Student s= (Student) context.getBean("s1");
		
		System.out.println(s);
	}
}
