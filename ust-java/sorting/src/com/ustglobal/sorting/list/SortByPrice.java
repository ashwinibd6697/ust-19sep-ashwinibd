package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByPrice implements Comparator<Marker>{

	@Override
	public int compare(Marker o1, Marker o2) {
		 Double d = o1.price;
		    Double d1 = o2.price;
		    return d1.compareTo(d);
	}

}
