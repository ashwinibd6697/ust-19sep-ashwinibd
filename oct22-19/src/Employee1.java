
public class Employee1 {
	String name;
	int id;
	Employee1(String name, int id){
		this.name=name;
		this.id=id;
	}	
	void details() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee ID is "+id);

	this.sayHello();
	}
	void sayHello() {
		System.out.println("Hello "+name+" "+" Welcome to UST Global company");

	}
	
//	static methods not loaded to object
//	we cont use this keyword inside static members
	public static void main(String[] args) {
		Employee1 e1 = new Employee1("Madhu",21);
		e1.details();
		Employee1 e2 = new Employee1("Acchu",23);
		e2.details();
		Employee1 e3 = new Employee1("Kitty",22);
		e3.details();
	}
}
