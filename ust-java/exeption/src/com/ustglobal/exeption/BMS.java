package com.ustglobal.exeption;

public class BMS {
   public static void main(String[] args) {
	System.out.println("bms Started");
	
	PVR p = new PVR();
	try{p.book();
	System.out.println("booking confirmed");
	
	}catch(ArithmeticException a) {
		System.out.println("booking failed");
	}
	
	
	System.out.println("bms ended");
	
}
}
