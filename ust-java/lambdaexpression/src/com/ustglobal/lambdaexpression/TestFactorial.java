package com.ustglobal.lambdaexpression;

public class TestFactorial {
public static void main(String[] args) {
	FactrialInterface fi = n ->{
		int fact =1;
		for(int i=2;i<=n;i++)
			fact =fact*i;
		
		return fact;
	};
	
	int f = fi.factorial(5);
	System.out.println(f);
	
}
}
