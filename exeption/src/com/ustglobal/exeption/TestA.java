package com.ustglobal.exeption;

public class TestA {
     public static void main(String[] args) {
		
    	 System.out.println("Main Started");
    	 
    	 int [] a= {10,20,30};                         
    	 System.out.println(a[1]);
    	 try {
    		 System.out.println(a[4]);
    	 }catch(ArrayIndexOutOfBoundsException e){
    		 System.out.println("index not found");
    		 
    	 }
    	 
    	 
    	 System.out.println("main ended");
	}
}
