package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestR {
   public static void main(String[] args) {
	   SortN s = new SortN();
	   SortID sid = new SortID();
	  TreeSet<Customer> t = new TreeSet<Customer>(sid);
	  
	   Customer c =new Customer(1,"ashwini",30000);
	   Customer c1 =new Customer(2,"acchu",90000);
	   Customer c2 =new Customer(3,"madhu",70000);
	   Customer c3 =new Customer(4,"amara",40000);
	   Customer c4 =new Customer(5,"kushal",50000);

    t.add(c);
    t.add(c1);
    t.add(c2);
    t.add(c3);
    t.add(c4);
    System.out.println("===========Using Uterator===");
    Iterator<Customer> it = t.iterator();
    while(it.hasNext()) {
    	Customer b = it.next();
    	System.out.println("Bank name is "+b.name);
    	System.out.println("bank pincode "+b.id);
    	System.out.println("MICR code "+b.salary);
        System.out.println("================================");
     }
   
   }
}
