package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.HelloConfigurationClass;
import com.ustglobal.springcore.config.HelloConfigurationClass;
import com.ustglobal.springcore.di.Animal;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class AnnotationApp {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(HelloConfigurationClass.class);
	 Hello hello = context.getBean(Hello.class);
	 System.out.println(hello.getMsg());
// to check singleton or not
	 //its singleton
	 Hello hello2 = context.getBean(Hello.class);
	 System.out.println(hello);
	 System.out.println(hello2);
	 
	 System.out.println("***************************");
	 
	 
//	 Animal animal = context.getBean(Animal.class);
//	 animal.makeSound();
//	 System.out.println("***************************");
	 Pet p = context.getBean(Pet.class);
	 System.out.println(p.getName());
	 p.getAnimal().makeSound();
	 
	 context.close();
}
}
