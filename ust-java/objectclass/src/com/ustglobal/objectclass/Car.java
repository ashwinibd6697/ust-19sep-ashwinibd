package com.ustglobal.objectclass;

public class Car {
   int cost;
   String color;
   String brand;
public Car(int cost, String color, String brand) {
	super();
	this.cost = cost;
	this.color = color;
	this.brand = brand;
}
  @Override
   public int hashCode() {
	   return cost;
   }
@Override
public String toString() {
	return "Car [cost=" + cost + ", color=" + color + ", brand=" + brand + "]";
}
 
  
}
