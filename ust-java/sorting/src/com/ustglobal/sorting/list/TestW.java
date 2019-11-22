package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestW {
public static void main(String[] args) {
	SortByName sn = new SortByName();
	SortByPin sp = new SortByPin();
	SortByMicr sm = new SortByMicr();
	TreeSet<Bank> ts = new TreeSet<Bank>(sp);
	
	Bank b1 = new Bank("CANARA",231231,11111);
	Bank b2 = new Bank("ICICI",998899,44444);
	Bank b3 = new Bank("SBI",412212,22222);
	Bank b4 = new Bank("Karnatak bank",334334,33333);

	Bank b5 = new Bank("CANARA",231231,11111);

ts.add(b1);
ts.add(b2);
ts.add(b3);
ts.add(b4);
ts.add(b5);
//

System.out.println("===========Using Uterator===");
Iterator<Bank> it = ts.iterator();
while(it.hasNext()) {
	Bank b = it.next();
	System.out.println("Bank name is "+b.name);
	System.out.println("bank pincode "+b.pincode);
	System.out.println("MICR code "+b.micr);
    System.out.println("================================");
 }



}
}
