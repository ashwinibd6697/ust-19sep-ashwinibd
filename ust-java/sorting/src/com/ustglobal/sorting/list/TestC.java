package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestC {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(30);
		l.add(40);
		l.add(20);

		Integer peekElement=l.peek();
		System.out.println("peek Element "+peekElement);
		Integer peekFirstElement = l.peekFirst();
		System.out.println("Poll First Element "+peekFirstElement);

		Integer peekLast = l.peekLast();
		System.out.println("Peek last Element "+peekLast);
		System.out.println("After poll===================="+l);

//		l.push(90);
//		System.out.println("After push-  "+l);
//		Integer p = l.pop();
//		System.out.println(p);
//		System.out.println("After pop--------->");

		Integer pollElement=l.poll();
		System.out.println("poll Element "+pollElement);
		Integer pollFirstElement = l.pollFirst();
		System.out.println("Poll First Element "+pollFirstElement);

		Integer pollLast = l.pollLast();
		System.out.println("Poll last Element "+pollLast);
		System.out.println("After poll===================="+l);

		l.push(90);
		System.out.println("After push-  "+l);
		Integer p = l.pop();
		System.out.println(p);
		System.out.println("After pop--------->");
	}
}
