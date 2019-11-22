package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarker {
	public static void main(String[] args) {
		ArrayList<Marker> a = new ArrayList<Marker>();
		a.add(new Marker(10,"red"));
		a.add(new Marker(20,"black"));
		a.add(new Marker(30,"blue"));
		a.add(new Marker(5,"green"));
		
		
		displayPenDetails(a);
		SortByPrice sb = new SortByPrice();
//		Collections.sort(a,sb);
		
//		System.out.println("After sorting================");
//		displayPenDetails(a);
		System.out.println("sort by color ");
		SortByPrice sb1 = new SortByPrice();
		Collections.sort(a,sb1);
		displayPenDetails(a);
		
	}
	  public static void displayPenDetails(ArrayList<Marker> p) {
		  Iterator<Marker> it =p.iterator();
		  while(it.hasNext()) {
			  Marker p1 = it.next();
			  
			  
			  System.out.println("Pen price "+p1.price);
			  
			  System.out.println("pen Brand "+p1.color);
			  System.out.println("++++++++++++++++++");
		  }
	  }
}
