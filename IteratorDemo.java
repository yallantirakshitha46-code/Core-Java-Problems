package com.java.basic.oops.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDemo {
	public static void main(String[] args)
	{
		ArrayList<String> a1=new ArrayList<>();
		a1.add("rakshi..");
		a1.add("srinu..");
		a1.add("sai..");
		a1.add("bunny..");
		Iterator<String> it1=a1.iterator();
		while(it1.hasNext())
		{
			String element=it1.next();
			if(element.equals("sai.."))
			{
				it1.remove();
			}
		}
		System.out.println(a1);
	}
}
