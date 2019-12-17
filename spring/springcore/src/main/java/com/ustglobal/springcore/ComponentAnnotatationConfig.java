package com.ustglobal.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.ComponentScanConfiguration;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class ComponentAnnotatationConfig {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
	Hello hello = context.getBean(Hello.class);
	hello.setMsg("Hi dear");
	 System.out.println(hello.getMsg());
	 
	 Pet p = context.getBean(Pet.class);
	 p.setName("koti");
	 System.out.println(p.getName());
	 p.getAnimal().makeSound();


}
}
