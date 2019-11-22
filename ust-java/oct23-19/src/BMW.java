
public class BMW implements AutoMobile1,AutoMobile2 {
  public  int gear() {
	  System.out.println("gear() method of BMW" );
	  return 10;
    	
    }
   public void gps() {
    	System.out.println("gps() method of BMW");
    }
   public void abs() {
	   System.out.println("its another abs() interface");
   }
}
