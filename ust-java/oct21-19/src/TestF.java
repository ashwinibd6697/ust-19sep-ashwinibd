
public class TestF {
public static void main(String[] args) {
	Student s1 = new Student();
	  Student.cname="PES College of Engineering";
	  s1.name="Ashwini";
	  s1.usn = 19;
	  System.out.println("college name is "+Student.cname);
	  System.out.println("student name is "+s1.name);
	  System.out.println("ID is "+s1.usn);
	  s1.read();
	
	}
}
