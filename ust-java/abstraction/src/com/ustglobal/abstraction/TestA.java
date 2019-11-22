package com.ustglobal.abstraction;

public class TestA {
	public static void main(String[] args) {
		Machine m = new Machine();
		
		ICICI i1 = new ICICI();
		m.slot(i1);

		HDFC h1 = new HDFC();
		m.slot(h1);
   
		SBI s1 = new SBI();
		m.slot(s1);
	}
}
