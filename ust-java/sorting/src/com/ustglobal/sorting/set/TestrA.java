package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestrA {
   public static void main(String[] args) {
	HashSet hs = new HashSet();
	hs.add(12);
	hs.add(45.7);
	hs.add(12);
	hs.add(null);
	hs.add("madhu");
	hs.add(56.7);
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
