package com.ustglobal.objectclass;

public class TestG {
  public static void main(String[] args) {
	Employee e = new Employee(1,"Ashwini",300000);
	Employee e1 = new Employee(2,"Abhi",500000);
	Employee e2 = new Employee(1,"Ashwini",300000);
	
	System.out.println(e.equals(e1));
	System.out.println(e.equals(e2));
	System.out.println(e1.equals(e2));
	System.out.println(e);
	System.out.println(e1);
	System.out.println(e2);
	
}
}
