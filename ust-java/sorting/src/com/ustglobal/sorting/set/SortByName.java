package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class SortByName {
     public static void main(String[] args) {

    	 Comparator<Employee> comp =(e1,e2)->{
    		 return e1.name.compareTo(e2.name);
    	 };
    	 
    	 
    	 
    	 TreeSet<Employee> hs = new TreeSet<Employee>(comp);
    	
    	
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
        	  System.out.println("id is "+e.id);
        	  System.out.println("name is "+e.name);
        	  System.out.println("salary is "+e.salary);
          }
	}
}
