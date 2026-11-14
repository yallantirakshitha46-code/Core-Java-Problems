package com.java.basic.oops.arraylist;
import java.util.Comparator;
public class ComparatorDemo implements Comparator<ArrayListDemo1>{
	@Override
	public int compare(ArrayListDemo1 o1,ArrayListDemo1 o2)
	{
		return o1.getEname().compareTo(o2.getEname());
	}
}
