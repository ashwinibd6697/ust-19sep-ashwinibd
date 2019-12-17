package com.ustglobal.exeption;

public class TestK {
   public static void main(String[] args) {
	System.out.println("mainn started");
	 PayTm p = new PayTm();
	 try{
		 p.book();
	 }catch(Exception e) {
		 System.out.println("book is failed in main");
	 }finally {
		 System.out.println("Executing finally");
	 }
	
	System.out.println("Main ended");
}
}
