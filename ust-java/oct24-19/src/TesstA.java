
public class TesstA {
    static int a;
    static {
    	a=20;
    	a=90;
    	a=120;
    	System.out.println("static block 1");
    }
    TesstA(){
    	System.out.println("TestA() constructor");
    }
    public static void main(String[] args) {
		TesstA t1 = new TesstA();
		TesstA t2 = new TesstA();
		System.out.println("a value "+a);
	}
    static {
    	a=20;
    	System.out.println("static block 2");
    }
    static {
    a=40;
    	System.out.println("static block 3");
    }
}

