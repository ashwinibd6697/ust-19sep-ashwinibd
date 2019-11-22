package com.ustglobal.sorting.list;

public class Student implements Comparable<Student>{
  int id;
  String name;
  double Percentage;
public Student(int id, String name, double percentage) {
	super();
	this.id = id;
	this.name = name;
	Percentage = percentage;
}
@Override
public int compareTo(Student o) {
     String p = this.name.toLowerCase();
     String q= this.name.toLowerCase();
     return p.compareTo(q);
}


//@Override
//public int compareTo(Student s) {
//	Integer i = this.id;
//	Integer j = s.id;
//	 return i.compareTo(j);
//}
  
}
