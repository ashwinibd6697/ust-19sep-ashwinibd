package com.ustglobal.objectclass;

public class Student {
   int id;
   String name;
   double percentage;
public Student(int id, String name, double percentage) {
	super();
	this.id = id;
	this.name = name;
	this.percentage = percentage;
} 
public int hashCode() {

      return id;
}


//	public String toString() {
//		// TODO Auto-generated method stub
//		return "name is "+name+ " and id is "+id +"Percentage is "+percentage;
//	}
   void printDetils() {
	   System.out.println("name is "+name+ " and id is "+id);
   }
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + ", hashCode()=" + hashCode()
			+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
}
}
