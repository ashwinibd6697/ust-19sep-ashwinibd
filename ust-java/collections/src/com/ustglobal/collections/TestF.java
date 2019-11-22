package com.ustglobal.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestF {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList();
		
		System.out.println("=============Besties=======");
		
		al.add("Madhushree");
		al.add("Kiran");
		al.add("Acchu");
		al.add("BR");
		al.add("Amarnath");
		al.add("Chandra");
		al.add("DileeP");
		al.add("Ananda");
		al.add("Bhavya");
		al.add("Ranju");
		al.add("Pallu");
		al.add("Kavitha");
		
		
		
		String name = al.get(0);
		System.out.println(name.toUpperCase());
     Iterator<String> li = al.iterator();
     while(li.hasNext()) {
    	 String s = li.next();
    	 System.out.println(s);
     }
		

		System.out.println("=========using for each=============");
		
		for(String o1 :al) {
			System.out.println(o1);
		
		
//		
//		
		}
	}

}
