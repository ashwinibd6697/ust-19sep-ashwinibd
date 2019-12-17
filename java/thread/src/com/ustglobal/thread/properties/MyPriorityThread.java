package com.ustglobal.thread.properties;

public class MyPriorityThread extends Thread{
	public static void main(String[] args) {
		System.out.println("Main started");

		int p = Thread.currentThread().getPriority();
		System.out.println("main thread priority "+p);

		Thread.currentThread().setPriority(7);
		System.out.println("Main thread proprity "+Thread.currentThread().getPriority());

		/*
		 *  Child thread priority is same as main thread
		 *  if u change the priority of main child priority also changed
		 */	

		MyPriorityThread t =new MyPriorityThread();
		int q = t.getPriority();
		System.out.println("Mypriority thread priority "+q);

		t.setPriority(6);
		System.out.println("Mypriority thread priority"+t.getPriority());

		System.out.println("Main ended");

	}
}
