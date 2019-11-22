package com.ustglobal.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {
 public static void main(String[] args) {
	LinkedList li = new LinkedList();
	li.add(12);
	li.add(34.5);
	li.add("more");
	li.add(true);
	li.add(null);
	System.out.println("  usiinfg for loop");
	for (int i = 0; i < li.size(); i++) {
		System.out.println(li.get(i));
	}
	
	
	System.out.println("=============using iterator======");
 
	Iterator it = li.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("============Using list iterator==========");
	
	ListIterator it1 = li.listIterator();
	while(it1.hasNext())
	{
		System.out.println(it1.next());
	}
	
	System.out.println("====================reverse order===============");
	while(it1.hasPrevious())
	{
		System.out.println(it1.previous());
	}
	
 
 }
}
