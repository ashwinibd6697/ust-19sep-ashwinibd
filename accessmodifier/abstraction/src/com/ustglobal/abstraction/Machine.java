package com.ustglobal.abstraction;

public class Machine {
   void slot(ATM a) {
	   a.validateCard();
	   a.getInfo();
	   System.out.println("*********************************");
   }
}
