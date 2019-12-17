package com.ustglobal.lambdaexpression;

public class TestMultiply {
  public static void main(String[] args) {
	MultipleInterface mul=(a,b)->a*b;
	
	int p =mul.multiply(10, 20);
	System.out.println("product is "+p);
}
}
