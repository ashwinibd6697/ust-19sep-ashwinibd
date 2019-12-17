package com.ustglobal.immutableclass;

public class TestString {
	
	public static void main(String[] args) {
	 System.out.println("main started");	
	
 MyString m1 = new MyString(10,"Abhi");
 System.out.println(m1.getName());
 System.out.println(m1.getRollno());
 System.out.println(m1.hashCode());
 
 System.out.println("=============================");
 MyString m2 =m1.changeContent(10, "Abhi");
 System.out.println(m2.getName());
 System.out.println(m2.getRollno());
System.out.println(m2.hashCode());
System.out.println("main ended");
	}
}