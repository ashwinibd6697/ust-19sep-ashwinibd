package com.ustglobal.java8features;

import java.util.ArrayList;
import java.util.List;

public class TestQ {
   public static void main(String[] args) {
	ArrayList<Student> a1=new ArrayList<Student>();
	
	Student s1 = new Student(1,"Abhi",36);
	Student s2 = new Student(1,"Arya",76);
	Student s3 = new Student(1,"Anand",56);
	Student s4 = new Student(4,"Acchu",46);
	
	a1.add(s1);
	a1.add(s2);
	a1.add(s3);
	a1.add(s4);
	Helper h =new Helper();
	h.displayAllStudent(a1);
	
	System.out.println("============================");
	h.displayFailed(a1);
	System.out.println("============================");
	h.displayTopper(a1);
	
	
	
	
}
}
