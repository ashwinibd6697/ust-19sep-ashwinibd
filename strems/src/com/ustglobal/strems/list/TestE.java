  package com.ustglobal.strems.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestE {
   public static void main(String[] args) {

	   ArrayList<Integer> a1 =new ArrayList<Integer>();
	   a1.add(10);
	   a1.add(90);
	   a1.add(30);
	   a1.add(400);
	   a1.add(50);
	   
	   
	   List<Integer> l = a1.stream().sorted().collect(Collectors.toList());
	   Iterator<Integer> it = l.iterator();
	   while(it.hasNext()) {
		   System.out.println(it.next());
	   }
}
}
