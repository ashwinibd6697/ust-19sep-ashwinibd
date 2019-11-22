package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
public static void main(String[] args) {
	LinkedHashSet<Double> hs = new LinkedHashSet<Double>();
	hs.add(12.4);
	hs.add(45.7);
	hs.add(12.4);
	hs.add(72.123);
	hs.add(95.6);
	hs.add(82.5);
//	hs.add(null);
//	hs.add("madhu");
//	hs.add("Kus/hal");
	System.out.println("=====================using for each=========");

 
 for(double o :hs)
 System.out.println(o);
 
 System.out.println("========using iterator=====");
 Iterator it = hs.iterator();
 while(it.hasNext()) {
	 System.out.println(it.next());
 }
	
}
}
