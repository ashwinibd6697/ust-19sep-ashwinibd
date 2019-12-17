package com.ustglobal.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.BookConfig;
import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

public class BookAnnotation {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(BookConfig.class);
	
		
	
	
Book b =context.getBean(Book.class);
System.out.println(b.getName());
System.out.println(b.getPrice());
System.out.println(b.getAuthor().getName());
System.out.println(b.getAuthor().getAddress());




}
}
