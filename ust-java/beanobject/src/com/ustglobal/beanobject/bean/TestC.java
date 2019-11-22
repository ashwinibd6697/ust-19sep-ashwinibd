package com.ustglobal.beanobject.bean;

import java.util.Scanner;

public class TestC {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	  
	   System.out.println("enter ID ");
	   int a = sc.nextInt();
	   System.out.println("enter  name ");
	   String b = sc.next();
	   System.out.println("Enter details");
	   String s = sc.nextLine();
	   System.out.println("enter salary ");
	   double d = sc.nextDouble();
	   
	   System.out.println(a);
	   System.out.println(b);
	   System.out.println(s);
	   System.out.println(d);
	   
   }
}
