
public class Student {
   String name;
   int age;
   int sid;
   String department;
   int marks;
   
   Student(String name,int age,int sid,int marks, String department){
	   this.name=name;
	   this.age=age;
	   this.sid=sid;
	   this.marks=marks;
	   this.department=department;
   }
    void Display() {
    	System.out.println("Student name is "+name);
    	System.out.println("Student age is "+age);
    	System.out.println("Student ID is "+sid);
    	System.out.println("Student department is "+department);
    	System.out.println("Student marks in percentage "+marks+"%");
    System.out.println("*********************************************");
    }
    public static void main(String[] args) {
		Student s1= new Student("Ashwini",21,19,74,"cs");
		s1.Display();
		Student s2= new Student("Acchu",22,20,77,"cs");
		s2.Display();
		Student s3= new Student("Kitty",22,21,70,"cs");
		s3.Display();
		Student s4= new Student("Amrutha",23,10,64,"cs");
		s4.Display();
		Student s5= new Student("Radhe",23,24,79,"EC");
		s5.Display();
		Student s6= new Student("Kanchana",21,10,94,"Civil");
		s6.Display();
		Student s7= new Student("Dileep",25,56,65,"cs");
		s7.Display();
		Student s8= new Student("Madhu",22,34,74,"BSC");
		s8.Display();
		Student s9= new Student("Chandra",24,11,84,"EEE");
		s9.Display();
		Student s10= new Student("Amarranath",23,03,58,"BCOM");
		s10.Display();
    }
    
}
