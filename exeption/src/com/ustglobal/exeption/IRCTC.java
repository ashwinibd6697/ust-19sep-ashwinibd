package com.ustglobal.exeption;

public class IRCTC {
  public void confirm() {
	System.out.println("IRCTC started");
	try{
		System.out.println(10/2);
	}catch(Exception e) {
	   System.out.println("error in IRCTC");
		throw e;
		
	}
	
	System.out.println("IRCTC ended ");
  
  }
}
