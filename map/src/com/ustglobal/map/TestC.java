package com.ustglobal.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> l = new LinkedHashMap<String, Integer>();
		l.put("Bangalore", 510001);
		l.put("Srirangapatna", 561415);
		l.put("Mandya", 560001);
		System.out.println(l);

		Set<String> s = l.keySet();
		for(String key :s) {
			System.out.println("key "+key);
		}
		System.out.println("=================");
		System.out.println("complete key set "+l.keySet());
		System.out.println("======================");

		Collection<Integer> s1 = l.values();
		for(Integer key :s1) {
			System.out.println("values "+key);

		}
		System.out.println("===================");
		System.out.println(l.values());
	}
}

