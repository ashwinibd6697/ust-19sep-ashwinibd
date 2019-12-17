package com.ustglobal.accessmodifier.pkg1;

import com.ustglobal.accessmodifier.pkg2.Demo;

public class SuperClaass extends Demo {
public static void main(String[] args) {
	Demo d = new Demo();
	SuperClaass s = new SuperClaass();
//	 System.out.println(d.a); 
//	 d.add();  NOT POSSIBLE BCZ ITS DECLARED AS PRIVATE
// 
//	System.out.println(d.b);
//	d.sub();  //default method can be access within a package
     
  System.out.println(s.c);
   s.mul();// protected method can be access within a package
   
   System.out.println(d.name);
   d.div();  
   
   
   //public can be access 
  }
}

