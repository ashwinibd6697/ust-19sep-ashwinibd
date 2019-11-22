package com.ustglobal.java8features;

import java.util.function.Consumer;

public class TestConsumer {
public static void main(String[] args) {
	
	Consumer<Student> c = s->{
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.percentage);
        System.out.println("============");
	};
	
	Student s1 = new Student(2,"bhargu",67.9);
	 c.accept(s1);
	
}
}
