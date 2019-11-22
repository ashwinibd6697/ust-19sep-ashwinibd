
public class Student {
	String name;
	int rollno;
	final static String CNAME="Qspiders";
	final int CID=8;
	Student(){
		
	}
	Student(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	final void print1() {
		System.out.println("hi"+name +"Welcome to "+CNAME);
	}
	final void print1(String name) {
		System.out.println("hi"+name +"Welcome to "+CNAME);
	}

}

