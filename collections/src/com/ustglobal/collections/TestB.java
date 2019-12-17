package com.ustglobal.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestB {
public static void main(String[] args) {
	ArrayList a1 = new ArrayList();
	a1.add(10);
	a1.add(29.7);
	a1.add("chinnu");
	a1.add(true);
	
	
	Iterator it = a1.iterator();
//	while(it.hasNext()) {
//		System.out.println(it.next());
		for(;it.hasNext();)
			System.out.println(it.next());
		
		
		
//	}
	System.out.println("======================");
	
	for(Object o :a1)
		System.out.println(o);
	
}
}
