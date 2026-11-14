package com.java.basic.oops.Cursor;
import java.util.ArrayList;
import java.util.ListIterator;
public class ListiteratorDemo {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("rakshi..");
		a1.add("srinu..");
		a1.add("sai..");
		a1.add("bunny..");
		ListIterator<String> li=a1.listIterator();
		System.out.println("--------------forward traversal-------------------");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("---------------backward traversal------------------");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}

}
