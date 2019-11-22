package com.ustglobal.beanobject.bean;

public class TestA {
   public static void main(String[] args) {
	 Student s1 = new Student();
	 s1.setId(12);
	 s1.setName("Vasuki");
	 s1.setRollNo(134556);
	 
	 
	 Database db = new Database();
	 db.recieve(s1);
	 
}
}
