package com.ustglobal.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
	
	
	
	Comparator<Student> cmp =(s1,s2) -> {
			if(s1.percentage>s2.percentage) return 1;
			
			else if(s1.percentage <s2.percentage) return -1;
			else return 0;
	};
  void displayAllStudent(ArrayList<Student> a) {
	  
	  Iterator<Student> it = a.iterator();
	   while(it.hasNext()) {
		   
		   
		  Student t =it.next();
		   System.out.println("id is "+t.id);
		   System.out.println("name is"+t.name);
		   System.out.println("percentage"+t.percentage);
	  
	   }
  }
  
  
  void displayFailed(ArrayList<Student> a1) {
	  
	List<Student> l = a1.stream().filter(s->s.percentage<= 40).collect(Collectors.toList());
	  
	

	  Iterator<Student> it = l.iterator();
	   while(it.hasNext()) {
		   
		   
		  Student t =it.next();
		   System.out.println("id is "+t.id);
		   System.out.println("name is"+t.name);
		   System.out.println("percentage is "+t.percentage);
		   
	   }
	  
  }
  
  
  
  void displayTopper(ArrayList<Student> a2) {
	  
	Student l =a2.stream().max(cmp).get();
		  System.out.println(l.name);
		

		 
	  }
} 
