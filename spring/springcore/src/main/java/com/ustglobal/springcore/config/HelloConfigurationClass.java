package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ustglobal.springcore.di.Hello;


@Configuration
@Import(PetConfigClass.class)
public class HelloConfigurationClass {

	@Bean(name="hello")
//	@Scope("prototype")
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMsg("I love India");
		return hello;
	}

	
}