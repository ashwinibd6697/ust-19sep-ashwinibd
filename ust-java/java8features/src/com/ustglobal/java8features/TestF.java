package com.ustglobal.java8features;

import java.util.function.Function;

public class TestF {
public static void main(String[] args) {
	Function<Integer, Student> f =id->{
		Student s =new Student(2,"vijay",56.78);
		s.id=id;
		return s;
	};
	Student s = f.apply(27);
	System.out.println("id : "+s.id);
	System.out.println("name : "+s.name);
	System.out.println("Percentage: "+s.percentage);
}
}
