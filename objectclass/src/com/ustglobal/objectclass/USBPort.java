package com.ustglobal.objectclass;

public class USBPort {
   public static void connect(Object obj) {
	
//	 if we write like this we get classcastexception bcz
//	   im main we pass pendrive object also mouse class cant understand 
//	   that object so that we use instanceof keyword to identify the object
//	   of its class
	   
//	    Pendrive p = (Pendrive) obj;
//	    p.read();
//	   Mouse m = (Mouse) obj;
//	   m.click();
	   
	 if(obj instanceof Mouse) {  
	   Mouse m = (Mouse) obj;
	   m.click();
	 }
	 else if(obj instanceof Pendrive)
	 {	  
	   
	   Pendrive p = (Pendrive) obj;
	   p.read();
	   
	 }else    System.out.println("Invalid object");
   }
}
