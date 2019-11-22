package com.ustglobal.strems.list;

import java.util.ArrayList;
import java.util.Comparator;

public class TestA {
	public static void main(String[] args) {
		
		
		  ArrayList<Integer> marks =new ArrayList<Integer>();
		  marks.add(10);
		  marks.add(20);
		  marks.add(30);
		  marks.add(41);
		  marks.add(50);
		  Comparator<Integer> cmp = (m1,m2)->{
			  if(m1>m2) return 1;
			  else if (m1>m2) return -1;
			  else return 0;
		  };
//		  Comparator<Integer> cm = (m1,m2)->{
//			  if(m1<m2) return 1;
//			  else if (m1<m2) return -1;
//			  else return 0;
//		  };

		  long l=  marks.stream().filter(i->i>35).count();
		
		  System.out.println(l);
		 Integer i = marks.stream().min(cmp).get();
     System.out.println(i);		
     
     
     
     Integer i1 = marks.stream().max(cmp).get();
     System.out.println(i1);	
			}
}
