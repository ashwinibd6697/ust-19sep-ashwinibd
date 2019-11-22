package com.ustglobal.sorting.list;

import java.util.HashSet;
import java.util.Iterator;

public class Testl {
public static void main(String[] args) {
	HashSet<Employee> hs = new HashSet<Employee>();
	Employee e1 = new Employee(12,"sweety",45000);
	Employee e2 = new Employee(17,"ash",55000);
	Employee e3 = new Employee(13,"cuty",65000);
	Employee e4 = new Employee(19,"putty",75000);
	Employee e5 = new Employee(12,"sweety",45000);
      hs.add(e1);
      hs.add(e2);
      hs.add(e3);
      hs.add(e4);
      hs.add(e5);
      
      System.out.println("===========using iterator==========");
      
      Iterator<Employee> it =hs.iterator();
      while(it.hasNext()) {
    	  Employee e= it.next();
    	  System.out.println(" id is "+e.id);
    	  System.out.println("name is "+e.name);
    	  System.out.println("salary is "+e.salary);
      }
}
}
