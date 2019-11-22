package com.ustglobal.sorting.list;

public class laptop implements Comparable<laptop> {
   double price;
   int ram;
   String name;
public laptop(double price, int ram, String name) {
	super();
	this.price = price;
	this.ram = ram;
	this.name = name;
}
@Override
 public int compareTo(laptop l)
 {
	Integer i = this.ram;
	Integer j = l.ram;
	return i.compareTo(j);
	
			
 }
   
}
