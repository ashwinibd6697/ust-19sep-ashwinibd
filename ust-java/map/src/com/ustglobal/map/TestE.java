package com.ustglobal.map;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
public static void main(String[] args) {
	TreeMap<String,Integer> l = new TreeMap<String, Integer>();
	l.put("Bangalore", 510001);
	l.put("SRPatna", 561415);
	l.put("Mandya", 560001);
//	l.put(null,98765); NullPointerException
	for(Map.Entry<String,Integer> m : l.entrySet()) {
		String key =m.getKey();
		Integer value =m.getValue();
		System.out.println("Key is "+key+"---------"+"value is "+value);
	}
}
}
