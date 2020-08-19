package com.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		ApplicationContext context 
		= new ClassPathXmlApplicationContext("root-annotation.xml");
		
		
	}
}
