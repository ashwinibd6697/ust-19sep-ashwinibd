package com.ustglobal.exeption.custom.checkedexception;

public class IncalidAmountException extends Exception {
   private String msg = "Daily limit is 40000";
   public String getMessage() {
	   return msg;
   }
}
