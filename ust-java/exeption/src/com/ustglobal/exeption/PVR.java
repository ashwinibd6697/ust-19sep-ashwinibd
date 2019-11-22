package com.ustglobal.exeption;

 class PVR {
   void book() {
	try {
		System.out.println("bookiing Started");
	   System.out.println(10/0);
	   System.out.println("logic for booking");
	   System.out.println("booking confirmed.........");
	   
   }catch(ArithmeticException e) {
	   System.out.println("booking cancelled");
	   throw e;
	   
   }
   }
}
