package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestE {
  public static void main(String[] args) {
	ArrayList<Pen> a = new ArrayList<Pen>();
	a.add(new Pen(10,"cello"));
	a.add(new Pen(20,"writometer"));
	a.add(new Pen(30,"renods"));
	a.add(new Pen(5,"santoor"));
	
	
	displayPenDetails(a);
	
	Collections.sort(a);
	System.out.println("After sorting================");
	displayPenDetails(a);
	
}
  public static void displayPenDetails(ArrayList<Pen> p) {
	  Iterator<Pen> it =p.iterator();
	  while(it.hasNext()) {
		  Pen p1 = it.next();
		  
		  
		  System.out.println("Pen price "+p1.price);
		  
		  System.out.println("pen Brand "+p1.brand);
		  System.out.println("++++++++++++++++++");
	  }
  }
}
