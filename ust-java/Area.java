class Area{

    static double area(double r){
       double a=3.14*r;
       return a;
        
     }
  static double circumference(double r){
    double cir=2*3.14*r;
     return cir;} 
  static boolean add(int number){
   if(number%2 ==0) return true;
   else return false;
 
}

 static int factorial(int n){
     int fact=1;
  for(int i=n;i>0;i--){
  
      fact=fact*i;
     }
   return fact;
}


static void greeting(String msg){
 
       System.out.println(msg);
 }



  public static void main(String[] args){
     double a=area(4.8);
        System.out.println("Area of circle is "+a);
     double cir=circumference(4.8);
       System.out.println("Circumference of circle is "+cir);
     boolean s=add(23);
        System.out.println("odd or even "+s);
     int f=factorial(5);
      System.out.println("factorial of a number "+f);
     greeting("Welcome to java class");
     }



}