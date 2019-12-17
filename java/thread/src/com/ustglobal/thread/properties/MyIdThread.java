package com.ustglobal.thread.properties;

public class MyIdThread extends Thread {
	public static void main(String[] args) {
		System.out.println("main started");


		System.out.println(Thread.currentThread().getId());

		MyIdThread m = new MyIdThread();
		System.out.println("myid thread "+m.getId());


		System.out.println("priority"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(9);

		/* System.out.println("priority "+Thread.currentThread().getPriority()); 
		 * Thread.currentThread().setPriority(18);
		 * we can set priority of main below 10 only
		 * 
		 *  */

		System.out.println("main ended");
	}

}
