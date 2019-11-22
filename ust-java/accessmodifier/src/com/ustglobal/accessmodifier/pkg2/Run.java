package com.ustglobal.accessmodifier.pkg2;

public class Run {
   public static void main(String[] args) {
	Demo d = new Demo();
//	 System.out.println(d.a); 
//	 d.add();  NOT POSSIBLE BCZ ITS DECLARED AS PRIVATE
  
	System.out.println(d.b);
	d.sub();  //default method can be access within a package
      
   System.out.println(d.c);
    d.mul();// protected method can be access within a package
    
    System.out.println(d.name);
    d.div();  //public can be access 
   }
}
