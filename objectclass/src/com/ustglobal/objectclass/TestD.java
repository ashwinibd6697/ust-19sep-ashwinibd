package com.ustglobal.objectclass;

public class TestD {
public static void main(String[] args) {
	Student s = new Student(19,"Ashwini",74.5);
	s.printDetils();
	System.out.println(s.hashCode());
	System.out.println(s);
}
}
