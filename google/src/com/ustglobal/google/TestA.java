package com.ustglobal.google;

public class TestA {
public static void main(String[] args) {
	Browser b1 = new Browser();
	 Google g1 = new GMAIL();
	 b1.open(g1);
	 Google d1 = new GoogleDrive();
	 b1.open(d1);
	 
	 
}
}


