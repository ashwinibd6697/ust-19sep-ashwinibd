
public class TestC {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "Ashwini";
		Person.color = "dark";
		p.age = 21;
		System.out.println("Person name is "+p.name);
		System.out.println("Person age is "+p.age);
		System.out.println("Person color is "+Person.color);
		p.eat();
		p.walk();
		Person.sleep();
		System.out.println("********************************************");
		
		Person p1 = new Person();
		p1.name = "Acchu";
		Person.color = "white";
		p1.age = 22;
		System.out.println("Person name is "+p1.name);
		System.out.println("Person age is "+p1.age);
		System.out.println("Person color is "+Person.color);
		p1.eat();
		p1.walk();
		Person.sleep();


	}
}
