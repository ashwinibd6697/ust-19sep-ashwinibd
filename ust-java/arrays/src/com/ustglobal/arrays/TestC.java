package com.ustglobal.arrays;

public class TestC {
  public static void main(String[] args) {
	Student s = new Student(1,"asdsaf",75.4);
	Student s1 = new Student(2,"as",71.4);
	Student s2 = new Student(1,"dsaf",70.4);
	
	Student [] sa = new Student[3];
	sa[0]=s;
	sa[1]=s1;
	sa[2]=s2;
	
	
	for(Student i : sa) {
		System.out.println(i);
	}
	
	recieve(sa);
	
}
  static void recieve(Student[] sa) {
	  for(Student i : sa) {
			System.out.println(i);
		}
  }
}
