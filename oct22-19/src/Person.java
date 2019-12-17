
public class Person {
	String name;
	int age;
	Person(String pname, int page){
		name=pname;
		age=page;
	}	
		void details() {
		System.out.println(name);
		System.out.println(age);
		
	}
	public static void main(String[] args) {
		System.out.println("My Besties.......");
		Person p1 = new Person("Madhu",21);
		p1.details();
		Person p2 = new Person("Kitty",22);
		p2.details();
		Person p3 = new Person("Acchu",23);
		p3.details();
		
		System.out.println("most jealous frnd");
		Person p4 = new Person("Ranju",22);
		p4.details();
		

	}
}
