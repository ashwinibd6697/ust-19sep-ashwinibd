package com.ustglobal.arrays;

public class TestA {
	public static void main(String[] args) {
		int [] a = new int[5];
		System.out.println("===========INTEGER============");
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);	
		}
		System.out.println("=====================BYTE===================");
		byte [] a1 = {100,20,30,40,50};
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]);	
		}
		System.out.println("=============== FOR EACH ======================");
		for(byte i : a1) {
			System.out.println(i);
		}
		System.out.println("===================char araay===========");
		char [] c = {'a','b','c','d','e'};

		for(int i=0;i<a1.length;i++) {
			System.out.println(c[i]);	
		}
		System.out.println("=============== FOR EACH ======================");
		for(char i : c) {
			System.out.println(i);
		}

		System.out.println("===============double array=============");
		double [] d = new double[5];

		d[0]=10.4434;
		d[1]=20.43;
		d[2]=30.234;
		d[3]=40.98;
		d[4]=50.78;

		for(int i=0;i<d.length;i++) {
			System.out.println(d[i]);	
		}
		System.out.println("=============== FOR EACH ======================");
		for(double i : d) {
			System.out.println(i);
		}

		String [] s = {"dsfs","sdfg","qwer","ewrrew"};

		System.out.println("================string array===========");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);	
		}
		System.out.println("=============== FOR EACH ======================");
		for(String i : s) {
			System.out.println(i);
		}

	}

}
