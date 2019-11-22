    package com.ustglobal.exeption;

public class TestD {
 public static void main(String[] args) {
	 System.out.println("Main Started");
	 
	 int b=10;
	 int [] a = {10,20,40};
	 try {
		 System.out.println(a[7]);
		
		 
	 }catch(ArrayIndexOutOfBoundsException a1) {
		 System.out.println("index not pressent");
	 }catch(ArithmeticException ae) {
		 System.out.println("number divided by zero.............");
	 }
	 try {
		 System.out.println(b/0);
	 }catch(ArithmeticException ae) {
		 System.out.println("number divided by zero");
	 }
	 
	 
	 System.out.println("main ended");
}
}
