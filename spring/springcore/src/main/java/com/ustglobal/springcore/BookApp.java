package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Book;

public class BookApp {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("book.xml");
Book b =context.getBean(Book.class);
System.out.println(b.getName());
System.out.println(b.getPrice());
System.out.println(b.getAuthor().getName());
System.out.println(b.getAuthor().getAddress());

}
}
