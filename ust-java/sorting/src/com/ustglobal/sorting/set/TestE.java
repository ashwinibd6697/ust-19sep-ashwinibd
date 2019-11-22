
package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
   public static void main(String[] args) {
	TreeSet hs =new TreeSet();
	hs.add(12);
	hs.add(45);
	hs.add(18);
	hs.add(56);
	hs.add(14);
	hs.add(56);
//	hs.add("deepika"); class cast exception
//	hs.add(null); null pointer exception
	System.out.println("=====================using for each=========");

   
   for(Object o :hs)
   System.out.println(o);
   
   System.out.println("========using iterator=====");
   Iterator it = hs.iterator();
   while(it.hasNext()) {
	 System.out.println(it.next());
   }
		   
}
}
