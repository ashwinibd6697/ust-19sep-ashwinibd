package com.ustglobal.singleton;

public class TestSingleton {
public static void main(String[] args) {
	MySingleton m = MySingleton.getDbConnection();
	m.s="hello";
//	System.out.println();
	
	System.out.println("hashcode of m "+m.hashCode());
	
	
	MySingleton m1 = MySingleton.getDbConnection();
	System.out.println("hashcode of m1 "+m1.hashCode());
	m1.s="hi";

	
	
	MySingleton m2 = MySingleton.getDbConnection();
	System.out.println("hashcode of m2 "+m2.hashCode());
	
	System.out.println(m.s);
	System.out.println(m1.s);
	
}
}
