package com.ustglobal.java8features;

import java.util.function.Function;

public class TestFunctionInterface {
      public static void main(String[] args) {
		Function<Integer,Integer> f =i->i*i;
		
		System.out.println(f.apply(5));
	}
}
