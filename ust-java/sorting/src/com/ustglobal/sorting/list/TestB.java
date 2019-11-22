package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
	public static void main(String[] args) {
		
	
	
LinkedList<laptop> a = new LinkedList<laptop>();

	laptop l = new laptop(200000,4,"lenovo");
	laptop l1 = new laptop(400000,8,"hp");
	a.add(l);
	a.add(l1);
	a.add(new laptop(700000,1,"dell"));
	
	System.out.println("before sorting");
	display(a);
	Collections.sort(a);
	System.out.println("after sorting");
	display(a);
	}
	  public static void display(LinkedList<laptop> l) {
		  Iterator<laptop> i1 = l.iterator();
		  
		  while(i1.hasNext()) {
			  laptop i = i1.next();
			  System.out.println("name is "+i.name);
			  System.out.println("ram is "+i.ram);
			  System.out.println("price is "+i.price);
			  System.out.println("=========================");
		  }
	  }
}
