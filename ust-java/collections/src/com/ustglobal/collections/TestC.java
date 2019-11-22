package com.ustglobal.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestC {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(29.7);
		a1.add("chinnu");
		a1.add(true);
		
		
		ListIterator l = a1.listIterator();
		
		
		while(l.hasNext()) {
			Object o = l.next();
			System.out.println(o);
			
			
		}
		System.out.println("=========================ULTA PALTA========");
		while(l.hasPrevious()) {
			Object o = l.previous();
			System.out.println(o);
		}
	}
}
