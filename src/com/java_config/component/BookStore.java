package com.java_config.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookStore {
	private Book book;
	
	@Autowired
	public BookStore(Book book) {
		super();
		this.book = book;
	}

	public Book getBook() {
		return book;
	}
}



