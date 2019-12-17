package com.ustglobal.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestJ {
	public static void main(String[] args) {
		ArrayList<Student> a1 = new ArrayList<Student>();
		Student s1 = new Student(101,"ankitha",45.55);
		Student s2 = new Student(102,"amir",65.55);
		Student s3 = new Student(103,"aniketh",75.55);
		
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		
		
		
	for(int i =0;i<a1.size();i++) {
		Student s = a1.get(i);
		System.out.println("ID is "+s.id);
		System.out.println("name is "+s.name);
		System.out.println("marks is "+s.marks);
	}
		
	
	System.out.println("=============for each========");
	
	
	for(Student s :a1) {
		System.out.println(s);
	}
	}

}
