
public class Bus {
   String color;
   int seats;
   Bus(){
	   this(40);
   }
   Bus(int seats){
	   this("red",seats);
   }
   Bus(String color,int seats){
	   this.seats=seats;
	   this.color=color;
   }
   void displaly() {
	   System.out.println("Welcome to "+color+" bus,bus seat capacity is "+seats);
//	   System.out.println(color);
   }
   
}
