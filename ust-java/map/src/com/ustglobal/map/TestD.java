package com.ustglobal.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {
public static void main(String[] args) {
	LinkedHashMap<String, Integer> l = new LinkedHashMap<String, Integer>();
	l.put("Bangalore", 510001);
	l.put("Srirangapatna", 561415);
	l.put("Mandya", 560001);
	
	
	for(Map.Entry<String,Integer> m : l.entrySet()) {
		String key =m.getKey();
		Integer value =m.getValue();
		System.out.println("Key is "+key+"---------"+"value is "+value);
	}
	
	
	
	//entryset() 
	System.out.println(l.entrySet());
}
}
