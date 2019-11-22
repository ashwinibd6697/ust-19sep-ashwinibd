package com.ustglobal.thread.defining;

public class MyThread extends Thread{
 public void run() {
	 for(int i=0;i<10;i++)
	 System.out.println("Child Thread");
 }
 public void run(int i ) {
	 System.out.println("dhjkfhsdkfhskh");
 }
// we can oveeride start() method but dont override start method bcz its acts like normal method 
// @Override
// public void start() {
//	 System.out.println("start() method");
// }
}
