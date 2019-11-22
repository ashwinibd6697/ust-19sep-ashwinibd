package com.ustglobal.thread.defining;

public class TeatRunnable {
public static void main(String[] args) {
	System.out.println("Main Started");
	MyRunnable r= new MyRunnable();
// r.start(); compile time error we cont call start method 
	Thread t = new Thread(r);
	t.start();
	for(int i=0;i<10;i++) System.out.println("Main thread");
	System.out.println("Main ended");
}
}
