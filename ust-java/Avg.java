class Avg{
public static void main(String[] args){
  int a=17;
  int b = 19;
  int c = 20;
int d =(a+b+c)/3;
System.out.println("avg is "+d);
int wt = 60;
double h = 2.5;
   
 double s=wt/(h*h);
System.out.println("BMI is"+s);

if(s>30 ){ 
System.out.println("you are in the obese range");}
else if(s>25){ 
System.out.println("you are in the over weight range");
}
else if(s>18.5){ 
System.out.println("you are in the healthy weight range"); 
}


if(s<18.5){ 
System.out.println("you are in the underweight range"); }
}
}
