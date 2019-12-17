package com.ustglobal.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {
   public static void main(String[] args) {
	Student s1 = new Student(1,"Abhi",86);
	Student s2 = new Student(2,"Ashwoini",76);
	Student s3 = new Student(3,"Acchu",66);
	Student s4 = new Student(4,"Amara",56);
	Student s5 = new Student(5,"Ananda",46);
	Student s6 = new Student(6,"Kavitha",36);
	Student s7 = new Student(7,"Ranju",26);
	Student s8 = new Student(8,"Pallavi",16);
	
	ArrayList<Student> a = new ArrayList<Student>();
	a.add(s1);
	a.add(s2);
	a.add(s3);
	
	ArrayList<Student> a1 = new ArrayList<Student>();
	a1.add(s4);
	a1.add(s5);
	a1.add(s6);
	
	ArrayList<Student> a2 = new ArrayList<Student>();
	a2.add(s7);
	a2.add(s8);
   
   HashMap<String,ArrayList<Student>> hm = new HashMap<>();
   hm.put("first", a);
   hm.put("second", a1);
   hm.put("third", a2);
   
  ArrayList<Student> f= hm.get("second");
  Iterator<Student> s =f.iterator();
    while(s.hasNext()) {
    	Student r = s.next();
    	System.out.println("id is "+r.id);
    	System.out.println("Name is "+r.name);
    	System.out.println("percentage is "+r.percentage);
    	System.out.println("======================");
    }
   
   
   
}
}
