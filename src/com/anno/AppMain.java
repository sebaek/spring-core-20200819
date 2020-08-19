package com.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		ApplicationContext context 
		= new ClassPathXmlApplicationContext("root-annotation.xml");
		
		Object o1 = context.getBean("book");
		Object o2 = context.getBean("bookStore");
		BookStore bs = (BookStore) o2;
		System.out.println(bs.getBook());
		
		System.out.println("done");
	}
}
