package com.ustglobal.strems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestD {
	public static void main(String[] args) {
		
	
  ArrayList<Integer> a1 =new ArrayList<Integer>();
  a1.add(10);
  a1.add(20);
  a1.add(30);
  a1.add(41);
  a1.add(50);
  
  List<Integer> l=
		  a1.stream().filter(i->i%2==0).collect(Collectors.toList());
for( Integer i :l)
  System.out.println(i);
	}
}
