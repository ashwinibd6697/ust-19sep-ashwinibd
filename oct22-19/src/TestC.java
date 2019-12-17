
public class TestC {
	TestC(){
		this(10);
//		to access constructor we should create object for every constuctor bcz we cant call explicitely to avoid these we can 
//		use this statement, using this  we can call any number of constructor 
//		
		System.out.println("TestC Constructor");
	}
	TestC(int a){
//		int c1=a;
		System.out.println(a);
//		System.out.println("TestC Constructor");
	}
	public static void main(String[] args) {
		System.out.println("main started");
	new TestC();
//	we cannot call a constructor explicitely.... c.TestC(10);
		System.out.println("main ended");
	}
}
