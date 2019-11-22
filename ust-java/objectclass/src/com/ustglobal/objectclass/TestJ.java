package com.ustglobal.objectclass;

public class TestJ {
   public static void main(String[] args) throws CloneNotSupportedException {
	Person p1 = new Person(1,"Ashwini");
	System.out.println(p1);
	Object o = p1.clone();
	Person p2 = (Person) o;
	System.out.println(p2);
	
	
	p2.id=300;
	p2.name="Abhi";
	System.out.println(p2);
	
}
}
