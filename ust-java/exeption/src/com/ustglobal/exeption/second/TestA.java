package com.ustglobal.exeption.second;

public class TestA {
public static void main(String[] args) {
	
	System.out.println("Main started");
	try {
		Thread.sleep(3000);
		System.out.println("inside try");
	}catch(InterruptedException ie) {
		ie.printStackTrace();
	}
	
	System.out.println("main ended");
}
}
