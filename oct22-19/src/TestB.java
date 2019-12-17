
public class TestB {
static int	a=25;
int x;
public static void add() {
//	local variable should be initialized
//	local variable can only be final no static,public,private,protected
	final int b;
	
	b=20;
	System.out.println(a);
	System.out.println(b);
	
	
}
public static void main(String[] args) {
	add();
	TestB t = new TestB();
	System.out.println("x valus is "+t.x);
}
}
