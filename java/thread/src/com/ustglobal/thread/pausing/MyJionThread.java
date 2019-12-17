package com.ustglobal.thread.pausing;

public class MyJionThread extends Thread {

	@Override 
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
	}
	
	
}
