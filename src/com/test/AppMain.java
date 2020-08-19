package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		ApplicationContext context 
		= new ClassPathXmlApplicationContext("root.xml");
		
		Object o = context.getBean("book");
		System.out.println(o);
		
		Object o1 = context.getBean("bookStore");
		System.out.println(o1);
		
		BookStore bs = (BookStore) o1;
		System.out.println(bs.getBook());
	}
}







