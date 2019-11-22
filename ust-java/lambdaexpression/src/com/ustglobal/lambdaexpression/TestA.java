package com.ustglobal.lambdaexpression;

public class TestA implements AddInterface {
	public static void main(String[] args) {
		 
		TestA a1 = new TestA();
	 	int sum=a1.add(10,20);
	 	System.out.println("Sum is "+sum);
	}
	
	
	
  public  int add(int a, int b) {
	  return(a+b);
  }
}
