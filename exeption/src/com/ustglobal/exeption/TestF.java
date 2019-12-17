    package com.ustglobal.exeption;

public class TestF {
 public static void main(String[] args) {
	 System.out.println("Main Started");
	 
	 int b=10;
	 int [] a = {10,20,40};
	 try {
		 System.out.println(a[7]);
		 System.out.println(b/0);
	 }catch(Exception ae) {
		 ae.printStackTrace();
	 }
	 
	 
	 System.out.println("main ended");
}
}
