
public class Test2 {
	public static void main(String[] args) {

		System.out.println("=========================first=======================");

		FirstGen f1 = new FirstGen();
		f1.msg();
		f1.call();

		System.out.println("=======================second=========================");

		SecondGen s1 = new SecondGen();
		s1.msg();
		s1.call();s1.games();

		System.out.println("=======================third=======================");

		ThirdGen t1=new ThirdGen();
		t1.msg();
		t1.call();
		t1.games();
		t1.camera();
	}
}
