package com.ustglobal.wrapperclass;

public class TestA {
	
	
public static void main(String[] args) {
     int a = 10;
     System.out.println("a is"+a);
     Integer i = a;
     System.out.println("i is "+i);
    //un boxing 
    Integer x = 10;
    
    Integer z = new Integer(20);
    System.out.println("x is "+x);
    int y = x;
    System.out.println("y is "+y);
     
     int value = Integer.parseInt("2344");
     System.out.println("value is "+value);
     
     boolean res = Boolean.parseBoolean("true");
     System.out.println("result is "+res);
     
     int value1 = Integer.parseInt("2344ytres");
     System.out.println("value is "+value1);
     
     boolean res1 = Boolean.parseBoolean("21345true");
     System.out.println("result is "+res1);
     
     
}
	
   
}
