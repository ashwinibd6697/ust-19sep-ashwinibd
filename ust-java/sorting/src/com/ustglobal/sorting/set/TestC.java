package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
	public static void main(String[] args) {
		
	
  LinkedHashSet hs = new LinkedHashSet();
	hs.add(12);
	hs.add(45.7);
	hs.add(12);
	hs.add(null);
	hs.add("madhu");
	hs.add("Kushal");
	System.out.println("=====================using for each=========");

 
 for(Object o :hs)
 System.out.println(o);
 
 System.out.println("========using iterator=====");
 Iterator it = hs.iterator();
 while(it.hasNext()) {
	 System.out.println(it.next());
 }
		   
}
}