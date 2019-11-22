package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
  public static void main(String[] args) {
	  HashSet<String> hs = new HashSet<String>();
		hs.add("Amar");
		hs.add("Kiran");
		hs.add("Kushal");
		hs.add("Acchu");
		hs.add("madhu");
		hs.add("Chandra");
		System.out.println("=====================using for each=========");

	   
	   for(String o :hs)
	   System.out.println(o);
	   System.out.println("========using iterator=====");
	   Iterator<String> it = hs.iterator();
	   while(it.hasNext()) {
		 System.out.println(it.next());
	   } 
}
}
