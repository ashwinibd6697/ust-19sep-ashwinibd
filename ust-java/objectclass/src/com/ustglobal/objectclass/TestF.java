package com.ustglobal.objectclass;

public class TestF {
public static void main(String[] args) {
	Cow c = new Cow(12,"cvx",120000);
	Cow c1 = new Cow(13,"wx",320000);
	Cow c2 = new Cow(13,"wx",320000);
	
	Cow c4=c;// reference of same object hashCode is same
	
	System.out.println(c.equals(c1));
	System.out.println(c.equals(c2));
	System.out.println(c1.equals(c2));
	System.out.println(c.equals(c4));
}
}
