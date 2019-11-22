
public class TestF {
	final void add() {
		System.out.println("g......");
	}
	final void add(int a) {
		System.out.println("f");
	}
	
public static void main(String[] args) {
	
//	SuperClass s1 = new SuperClass();
	
//	this and super keyword not written inside static method
	SubClass s2 = new SubClass();
	s2.getData();
	TestF f = new TestF();
	f.add();
	f.add(10);
}
}
