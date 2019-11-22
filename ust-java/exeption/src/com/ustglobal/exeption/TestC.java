    package com.ustglobal.exeption;

public class TestC {
 public static void main(String[] args) {
	 System.out.println("Main Started");
	 
	 int b=10;
	 int [] a = {10,20,40};
	 try {
		 System.out.println(a[4]);
		 System.out.println(b/2);
		 
	 }catch(ArithmeticException ae) {
		 System.out.println("number divided by zero");
	 }catch(ArrayIndexOutOfBoundsException a1) {
		 System.out.println("index not pressent");
	 }
	 
	 
	 
	 System.out.println("main ended");
}
}
