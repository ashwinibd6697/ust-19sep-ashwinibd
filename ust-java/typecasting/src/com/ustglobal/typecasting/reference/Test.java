package com.ustglobal.typecasting.reference;

public class Test {
	public static void main(String[] args) {


		Pen p = new Pen();
		p.write();
		Pen p1 = new Marker();// up casting
		p1.write();
		System.out.println(p1.cost);


		Marker m = (Marker) p1;//Down casting
		m.color();
		m.write();
	}
}
