package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestPQ {
   public static void main(String[] args) {
	PriorityQueue<Integer> pq = new PriorityQueue();
	pq.add(12);
	pq.add(24);
	pq.add(94);
	pq.add(54);
	
//	pq.add("hello"); classcast exception
	Iterator<Integer> it = pq.iterator();
    while(it.hasNext()) {
    	System.out.println(pq.poll());
    }
}
}
