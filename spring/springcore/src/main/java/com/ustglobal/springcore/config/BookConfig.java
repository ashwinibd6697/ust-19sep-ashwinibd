package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

public class BookConfig {

	@Bean(name="author")
	
	
	public Author getAuthor() {
		Author a = new Author();
		a.setName("PadmaRedddy");
		a.setAddress("Bangalore");
		return a;
	}
	
	
	@Bean(name="book")
	
	public Book getBook() {
		Book b = new Book();
		b.setName("ccp");
		b.setPrice(400);
		b.setAuthor(getAuthor());
		return b;
	}
	
}
