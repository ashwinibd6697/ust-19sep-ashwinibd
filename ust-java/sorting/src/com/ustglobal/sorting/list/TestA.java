package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {
public static void main(String[] args) {
	ArrayList<Student> a1 = new ArrayList<Student>();
	
	
	Student s1 = new Student(12,"dimople",35.6);
	Student s2 = new Student(2,"sweety",30.8);
	Student s3 = new Student(34,"jimmy",65.6);
	Student s4 = new Student(5,"tummy",75.6);
	a1.add(s1);
	a1.add(s2);
	a1.add(s3);
	a1.add(s4);
	
	
	System.out.println("before sorting");
	display(a1);
	
	Collections.sort(a1);
	System.out.println("After sorting");
	display(a1);
}

static void display(ArrayList<Student> a1) {
	Iterator<Student> it =a1.iterator();
	while(it.hasNext()) {
		Student s = it.next();
		System.out.println("id is "+s.id);
		System.out.println("name is "+s.name);
		System.out.println("marks is "+s.Percentage);
		System.out.println("=====================");
	}
	
}
}
