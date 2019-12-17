package com.ustglobal.exeption.custom.checkedexception;

public class ValidateAmount {
   void checkAmount(int amount) throws IncalidAmountException {
	   if(amount > 40000) throw new IncalidAmountException();
   }
}
