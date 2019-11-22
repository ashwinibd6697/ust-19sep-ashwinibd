


public class TestB {
   static int a;
   int b;
   
   
//   within method we can create final variable or non static variable only
//   it does not support any other modifier
  public void add(){
	  int t=100;
	  System.out.println("t vlue 100");
	 
	  
  }
   {
	   a = 10;
	   b = 20;
	   System.out.println("non static block 1 ");
   }
   
   public static void main(String[] args) {
	  System.out.println("main started");
	   TestB t1 = new TestB();
	   TestB t2 = new TestB();
	   t1.add();
	   System.out.println("main ended");
	   {
		   t1.b=200;
		   System.out.println("b value "+t1.b);
	   }
	   
}
   {
	   a = 10;
	   b = 20;
	   System.out.println("non static block 2 ");
   }
   {
	   a = 10;
	   b = 20;
	   System.out.println("non static block 3 ");
   }
}
