package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		ApplicationContext context 
		= new ClassPathXmlApplicationContext("root.xml");
		
		Object o = context.getBean("book");
		
		Book b = (Book) o;
		System.out.println(b);
	}
}







