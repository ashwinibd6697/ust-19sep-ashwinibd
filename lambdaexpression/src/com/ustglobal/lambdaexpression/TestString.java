package com.ustglobal.lambdaexpression;

public class TestString {
 public static void main(String[] args) {
//	TestString t = new TestString();
   Stringinterface s = m->{
	  
	   System.out.println("hello");
	   return m;
   };
	 
   
	     
   String p = s.greet("hi");
   System.out.println(p);
   }
}

