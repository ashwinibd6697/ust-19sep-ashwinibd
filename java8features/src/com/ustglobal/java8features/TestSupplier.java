package com.ustglobal.java8features;

import java.util.function.Supplier;

public class TestSupplier {
public static void main(String[] args) {
	Supplier<Student> s = ()->new Student(2,"ajay",65.6);
	
	
	Student s1 = s.get();
	System.out.println("id is "+s1.id);
	System.out.println("name is "+s1.name);
	System.out.println("percentage is "+s1.percentage);
	System.out.println("===========================");

  Supplier<Integer> i =()->20;
  System.out.println(i.get());
  
  
  Supplier<String> i1 =()->"vade beka ranjana";
   System.out.println(i1.get());
   
   
}
}
