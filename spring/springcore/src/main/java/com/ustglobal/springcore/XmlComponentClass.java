package com.ustglobal.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class XmlComponentClass {
public static void main(String[] args) {
	
	 ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("compnt.xml");
	 Hello h = context.getBean(Hello.class);
	 h.setMsg("hi Darling");
	 System.out.println(h.getMsg());
	
	  
	 
	 Pet p = context.getBean(Pet.class);
	 p.setName("kukku");
	 System.out.println(p.getName());
	 p.getAnimal().makeSound();

	 context.close();
}
}
