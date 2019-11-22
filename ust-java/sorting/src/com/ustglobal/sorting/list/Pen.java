package com.ustglobal.sorting.list;

public class Pen implements Comparable<Pen>{
  double price;
  String brand;
  
public Pen(double price, String brand) {
	super();
	this.price = price;
	this.brand = brand;
}
@Override
public int compareTo(Pen o) {
    Double d = this.price;
    Double d1 = o.price;
    return d1.compareTo(d);
}

//@Override
//public int compareTo(Pen o) {
//	String s = this.brand;
//	String s1=o.brand;
//	return s.compareTo(s1);
//	
//			
//}
  
}
