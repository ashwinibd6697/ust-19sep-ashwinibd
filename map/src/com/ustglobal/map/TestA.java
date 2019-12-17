package com.ustglobal.map;

import java.util.HashMap;

public class TestA {
public static void main(String[] args) {
	HashMap hm = new HashMap();
	
	hm.put("mala", 76554);
	hm.put("sheela", 19876);
	hm.put("kuku",90876);
	
	System.out.println("Data is "+hm);
	hm.put("mala", 11111);
	System.out.println("After duplicate, Data is "+hm);
	hm.put("dimple", 19876);
	System.out.println("value can be duplicate,data is "+hm);
	hm.put(null, 65433);
	System.out.println("null can be added,After null "+hm);
	hm.put(null, 987000000);
	System.out.println("After null replace "+hm);
	
	
	
	System.out.println("==================");
	Object pn = hm.get("mala");
	System.out.println(pn);
	
	
	
	Object pn1 = hm.get("mal");//null
	System.out.println(pn1);
	Object pn2 = hm.remove("mala");
	System.out.println(pn2);
	System.out.println("After remove "+hm);
}
}
