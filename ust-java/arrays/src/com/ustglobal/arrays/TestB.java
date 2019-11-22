package com.ustglobal.arrays;

public class TestB {
   public static void main(String[] args) {
	int [] a = {10,20,30,35,50};
	
	recieve(a);
	
	System.out.println("===================================");
	int [] e=getArray();
	
	for(int i :e)
	System.out.println(i);
	System.out.println("=============================");
	String [] s = {"adsdf","dsfdsf","sdfsg"};
	recieve(s);

	System.out.println("===================================");
	String [] e1=getArray1();
	
	for(String i :e1)
	System.out.println(i);
	
	
	
//	System.out.println(a[10]); arrayIndexOutofBoundsException
}
   
   static void recieve(int [] a) {
	for(int i : a) {
		System.out.println(i);
	}
   }

   static void recieve(String [] s) {
	for(String i : s) {
		System.out.println(i);
	}
   }
   
   static int[] getArray() {
	   int [] values = {2,3,4,5,56};
	   return values;
   }
   
   static String[] getArray1() {
	   String [] values = {"ewr","ewrwe","dsfsdf","12"};
	   return values;
   }
}
