package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		TreeSet<String> hs = new TreeSet<String>();
		hs.add("Amar");
		hs.add("Kiran");
		hs.add("Kushal");
		hs.add("Acchu");
		hs.add("madhu");
		hs.add("Chandra");
		hs.add("BR");


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
