package com.ustglobal.exeption.custom.checkedexception;

public class TestAmount {
 public static void main(String[] args) {
	System.out.println("main started");
	
   ValidateAmount va = new ValidateAmount();
   try {
	   va.checkAmount(50000);
	   System.out.println("withdraw your cash");
   }catch(IncalidAmountException e) {
	   System.err.println(e.getMessage());
   }
	
	
	System.out.println("main ended");
}  
}
