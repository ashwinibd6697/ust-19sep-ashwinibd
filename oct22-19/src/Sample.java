
public class Sample {
   public static void m1() {
	  System.out.println("sdfghjkhgf");
	   m2();
   }
   public static void m2() {
	   
	   System.out.println("987654321456");
	   m1();
	   
   }
   
   Sample(){
	   this(2);
	   System.out.println("sdfghjhgfds");
	  
   }
   
   Sample(int s){
   }
   public static void main(String[] args) {
	m1();
}
   
  
}
