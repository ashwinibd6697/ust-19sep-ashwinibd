package com.ustglobal.map;

import java.util.HashMap;

public class TestB {
public static void main(String[] args) {
HashMap hm = new HashMap();
	
	hm.put("mala", 76554);
	hm.put("sheela", 19876);
	hm.put("kuku",90876);
  

	
	HashMap hm1 = new HashMap();
	hm1.put("Anand", 44444);
	hm1.put("Ashwini", 99999);
	hm1.put("Abhi",88888);
    //containskey(key) this method checks for key is present or not
	System.out.println(hm.containsKey("mala"));//its present returns true
	System.out.println(hm.containsKey("mal"));//false
	//containsValue(value) it checks value present or not,
	//if present return true else false
	System.out.println(hm.containsValue(99999));
	
	//putAll(map) it stores one map content to another map
	hm.putAll(hm1);
  System.out.println("====================");	
	System.out.println("After putAll()----->"+hm);
	
	System.out.println(hm1);
	
	
	System.out.println("==================");
	
	//it returns length of map
	System.out.println(hm.size());
	
	//to check for map is empty or not
	System.out.println(hm.isEmpty());
	//to delete
//	hm.clear();
//   System.out.println(hm);

}
}
