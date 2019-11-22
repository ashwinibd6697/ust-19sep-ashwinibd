package com.ustglobal.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestK {
	public static void main(String[] args) {
		ArrayList<Double> a1 = new ArrayList<Double>();    
		a1.add(12.4);
		a1.add(22.5);
		//		a1.add("chinnu");
		a1.add(null);
		//	a1.add("chinnu");
		a1.add(12.4);
		a1.add(null);
		a1.add(34.9);

		System.out.println(a1);
		a1.add(2,54.6);
		System.out.println("After add in 2nd index "+a1);
		a1.remove(0);
		System.out.println("After removing 0th index "+a1);
		a1.remove(null);
		System.out.println("after removing null "+a1);
		Double val = a1.get(4);
		System.out.println("Object at 4th index "+val);

		a1.set(2, 77.6);
		System.out.println("After replacing 2nd index "+a1);

		a1.clear();
		System.out.println("After clear method "+a1);
		a1.contains(56.4);
		System.out.println(a1);


		List<Double> a2 = new ArrayList<Double>();  
		a2.add(12.4);
		a2.add(23.4);
		a2.add(34.5);
		
		a1.addAll(a2);

		System.out.println("After add all "+a1);
		
		boolean contain = a1.containsAll(a2);
		System.out.println("Contains all of a2"+contain);

		boolean res = a1.removeAll(a2);
		System.out.println("Removed all of a2 "+res);


	}
}
