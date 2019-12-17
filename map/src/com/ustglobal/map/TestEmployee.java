package com.ustglobal.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestEmployee {
     public static void main(String[] args) {
    	 Emp e1 = new Emp(12,"sweety",45000.0);
 		Emp e2 = new Emp(17,"ash",55000);
 		Emp e3 = new Emp(13,"cuty",65000);
 		Emp e4 = new Emp(19,"putty",75000);
 		Emp e5 = new Emp(12,"sweety",45000);
 		 Emp e6 = new Emp(12,"sweety",45000.0);
  		Emp e7= new Emp(7,"ashwini",35000);
  		Emp e8 = new Emp(1,"kitty",25000);
  		Emp e9 = new Emp(9,"abhi",95000);
  		Emp e = new Emp(2,"ananda",15000);
  		
  		ArrayList<Emp> a1 = new ArrayList<Emp>();
  		a1.add(e1);
  		a1.add(e);
  		a1.add(e2);
  		
  		ArrayList<Emp> a2 = new ArrayList<Emp>();
  		a2.add(e3);
  		a2.add(e4);
  		a2.add(e5);
  		a2.add(e6);
  	   
  		ArrayList<Emp> a3 = new ArrayList<Emp>();
  		a3.add(e7);
  		a3.add(e8);
  		a3.add(e9);
  		
  		
  	   HashMap<String,ArrayList<Emp>> hm = new HashMap<>();
  	   hm.put("first", a1);
  	   hm.put("second", a2);
  	   hm.put("third", a3);
	
     
     
     ArrayList<Emp> f= hm.get("second");
     Iterator<Emp> s =f.iterator();
       while(s.hasNext()) {
       	Emp r = s.next();
       	System.out.println("id is "+r.id);
       	System.out.println("Name is "+r.name);
       	System.out.println("salary is "+r.salary);
       	System.out.println("======================");
       }

}
}