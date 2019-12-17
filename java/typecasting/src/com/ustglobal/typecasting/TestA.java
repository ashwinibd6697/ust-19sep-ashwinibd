package com.ustglobal.typecasting;
// Primitive casting
public class TestA {
   public static void main(String[] args) {
	int a = 10;
	double d = a;//implicit casting
	System.out.println("implicit casting "+d);
	System.out.println("*****************");
	double s = 30.4;
	int b = (int) s; //explicit casting
	System.out.println("Explict cating "+b);
}
}
                                                       