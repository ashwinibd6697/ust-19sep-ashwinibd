package com.ustglobal.beanobject.bean;

public class TestB {
 public static void main(String[] args) {
	Employee e = new Employee();
	  e.setId(12);
	  e.setDept("software");
	  e.setDesignation("Developer");
	  e.setName("Ashwini");
	  e.setSalary(300000);
	  Database1 d = new Database1();
	   d.read(e);
}
}
