
public class Employee {
	String name;
	int eid;
	Employee(String ename,int id){
		name=ename;
		eid = id;
		
		System.out.println(name);
		System.out.println(eid);
		
		
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("Rakshitha",120);
//		e1.name = "Rakshitha";
//		e1.eid = 143;
//
		Employee e2 = new Employee("Ramya",1324354);
//		e2.name = "Ramya";
//		e2.eid = 144;
//
		Employee e3 = new Employee("Darshan",65432);
//		e3.name = "Darshan";
//		e3.eid = 132;
	}
}
