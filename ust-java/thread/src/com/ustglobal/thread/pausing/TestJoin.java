package com.ustglobal.thread.pausing;

public class TestJoin {
public static void main(String[] args) {
	System.out.println("main started");
	
	
	MyJionThread m = new MyJionThread();
	m.start();
	try {
		
		m.join(10000);
	}catch(Exception e) {
		e.printStackTrace();
	}
	for(int i =0;i<10;i++)
	System.out.println("main thread");
	
	System.out.println("main ended");
}
}
