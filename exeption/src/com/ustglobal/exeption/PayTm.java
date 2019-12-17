package com.ustglobal.exeption;

public class PayTm {
   public void book() {
	   
	   System.out.println("payTM started");
//	   System.out.println("book() method");
	   IRCTC i = new IRCTC();
		   try{
			   i.confirm();
		   }catch(Exception e) {
			   System.out.println("error in paytm");
			   throw e;
		   }
	   System.out.println("paytm ended");
   }
}
