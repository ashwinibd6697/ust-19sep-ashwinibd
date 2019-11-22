package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByPin implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		Integer a = o1.pincode;
		Integer a1 =o2.pincode;
		return a.compareTo(a1);
	}

	

}
