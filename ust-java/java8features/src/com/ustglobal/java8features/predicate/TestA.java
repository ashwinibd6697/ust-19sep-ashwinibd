package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

public class TestA {
    public static void main(String[] args) {
		
    	Predicate<Employee> p1= p->p.id==1;
    	
    	
    	Employee p = new Employee(1,"AShwini",300000);
	
    System.out.println(p1.test(p));
    }
}
