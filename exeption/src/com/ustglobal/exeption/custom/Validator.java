package com.ustglobal.exeption.custom;

public class Validator {
  
	
	void verify(int age) {
		if(age<18)
     throw new InvalidAgeException("Try Again next time!!");
	}
}
