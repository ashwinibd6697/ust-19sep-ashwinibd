package com.ustglobal.java8features;

import java.util.function.Predicate;

public class TestB {
	public static void main(String[] args) {
        
        Predicate<Student> p =s->s.percentage>=35;  		
			
		Student s1 = new Student(1,"Abhi",36);
		System.out.println(p.test(s1));
	}
}
