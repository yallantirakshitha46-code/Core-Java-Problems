package com.java.basic.oops.arraylist;
import java.util.Comparator;
public class ComparatorDemo2 implements Comparator<LinkedListDemo2>{
	@Override
	public int compare(LinkedListDemo2 o1,LinkedListDemo2 o2)
	{
		return Double.compare(o1.getProPrice(),o2.getProPrice());
	}
}

