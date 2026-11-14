package com.java.basic.oops.arraylist;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListDemo2_Main {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(new LinkedListDemo2(120,"Raraj",123000));
		l1.add(new LinkedListDemo2(143,"Srinu",15000));
		l1.add(new LinkedListDemo2(234,"Rakshi",16000));
		l1.add(new LinkedListDemo2(101,"Rani",133000));
		System.out.println("the object of products list: "+l1 );
		l1.sort(new ComparatorDemo2());
		Iterator it=l1.iterator();
		System.out.println("after sorting order...");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
