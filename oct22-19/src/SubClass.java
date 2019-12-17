
public class SubClass extends SuperClass {
	String s = "d";
  SubClass(){
	  super();
	  System.out.println("e");
  }
	void getData() {
		System.out.println(s);
		System.out.println(this.s);
		
		System.out.println(super.s);
		super.superClassMethod();
	
	}
}
