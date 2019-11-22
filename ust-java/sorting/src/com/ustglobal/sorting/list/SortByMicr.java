package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByMicr implements Comparator<Bank> {

	@Override
	public int compare(Bank o1, Bank o2) {
		Long l = o1.micr;
		Long l1 = o2.micr;
		return l.compareTo(l1);
	}

}
