package com.ustglobal.objectclass;

public class TestH {
	public static void main(String[] args) {
       Product p = new Product(1,"Pen","sd",10,"djkdj");
       Product p1 = new Product(1,"Pencil","gfd",50,"kdj");
        Product p2 = new Product(1,"Pen","sd",10,"djkdj");
          System.out.println(p.equals(p1));
           System.out.println(p.equals(p2));
          System.out.println(p1.equals(p2));
   
	}
}
