package java.util;

import java.util.stream.Collectors;

public class TestB {
public static void main(String[] args) {

	  ArrayList<Employee> a1 =new ArrayList<Employee>();
	  
	  Employee e1 = new Employee(1,"timma");
	  Employee e2 = new Employee(2,"katte");
	  Employee e3 = new Employee(3,"bheema");
	  
	  
	  a1.add(e1);
	  a1.add(e2);
	  a1.add(e3);
	  Comparator<Employee> cmp =(e5,e6)->{
		  return e5.name.compareTo(e6.name);
	  };
	  
	  List<Employee> l=a1.stream().sorted(cmp).collect(Collectors.toList());
	  
	  Iterator<Employee> it = l.iterator();
	   while(it.hasNext()) {
		   
		   
		  Employee t =it.next();
		   System.out.println("id is "+t.id);
		   System.out.println("name is"+t.name);
		   
		   
	   }
	  
	  
	  
	  
	 
}
}
