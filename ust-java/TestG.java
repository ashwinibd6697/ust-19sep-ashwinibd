class TestG{
public static void main(String[] args){
  int a=10;
 switch(a){
 case 10 : System.out.println("value of 10 is "+a);
 case 20 : System.out.println("value of 20 is "+a);
}
char grade='A';
 switch(grade){
   case 'A' : System.out.println("FCD");
                  break;
   case 'B' : System.out.println("FC");
                  break;
   case 'C' : System.out.println("SC");
                  break;
   case 'D' : System.out.println("P");
                  break;
   case 'E' : System.out.println("F");
                  break;
    default : System.out.println("Invalid Grade");            

}
System.out.println("==========================using if======================");
if(grade=='A')System.out.println("FCD");
else if(grade=='B')System.out.println("FC");
else if(grade=='C')System.out.println("SC");
else if(grade=='D')System.out.println("P");
else if(grade=='E')System.out.println("F");
else System.out.println("Invalid Grade");
}
}