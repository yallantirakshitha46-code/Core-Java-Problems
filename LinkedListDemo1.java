package com.java.basic.oops.arraylist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
	public static void main(String[] args)
	{
		LinkedList l1=new LinkedList();
		l1.add("RED");
		l1.add("ORANGE");
		l1.add("WHITE");
		l1.add("PINK");
		l1.add(1000);
		l1.add(null);
		System.out.println("The given objects are: "+l1);
		l1.addFirst("BLACK");
		l1.addLast("MAROON");
		l1.add(3,"Blue");
		Iterator it=l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
