package com.ustglobal.objectclass;

public class TestE {
public static void main(String[] args) {
	Car c = new Car(100000,"black","BMW");
	  System.out.println(c.hashCode());
	  System.out.println(c);
	  Car c1 = new Car(100000,"black","BMW");
	  System.out.println(c1.hashCode());
	  System.out.println(c1);
	  Car c2 = new Car(500000,"white","Audi");
	  System.out.println(c2.hashCode());
	  System.out.println(c2);
//	  Car c3 = c;
//	  System.out.println(c.hashCode());
//	  System.out.println(c3.hashCode());
//	  hashcode is same
	 
}
}
