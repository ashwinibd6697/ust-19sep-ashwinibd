package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

public class TestB {
  public static void main(String[] args) {
	
	  Predicate<Qspider> p = q->q.placed_Student_count>14;
	  
	  Qspider q =new Qspider(100,"java",15);

     System.out.println(p.test(q));
  }
  
}
