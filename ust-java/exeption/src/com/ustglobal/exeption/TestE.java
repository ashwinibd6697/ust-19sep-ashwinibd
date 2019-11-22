package com.ustglobal.exeption;

public class TestE {
	public static void main(String[] args) {
		System.out.println("Main Started");
      int [] a = {10,20,30};
      int b= 10;
		String s = "hello";
		//String s= null; if will throw exception
		try{
			String s1 = s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[9]);
//			System.out.println(a[9]); exception
			System.out.println(b/2);
//			System.out.println(b/0); exception
		}catch(Exception aww) {
			aww.printStackTrace();
			System.out.println("EXCEPTION OCCURED");
		}
//		}catch(NullPointerException n) {
//			System.out.println("dont play with null");
//		}catch(ArrayIndexOutOfBoundsException ae) {
//			System.out.println("index not present");
//		}catch(ArithmeticException a1) {
//			System.out.println("number divided by zero");
//		}


		System.out.println("Main Ended");
	}
	}
