package com.java.basic.oops.arraylist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo1 {
	public static void main(String[] args)
	{
		LinkedList l1=new LinkedList();
		l1.add("Red");
		l1.add("Orange");
		l1.add("White");
		l1.add("Pink");
		l1.add(1000);
		l1.add(null);
		System.out.println("The given objects are: "+l1);
		l1.addFirst("Black");
		l1.addLast("Maroon");
		l1.add(3,"Blue");
		Iterator it=l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		ListIterator lit=l1.listIterator();
		System.out.println("In forward direction");
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		System.out.println("In backward direction");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
	}
}
