package com.java.basic.oops.arraylist;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo1_Main {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(new ArrayListDemo1(120,"Raraj",123000));
		a1.add(new ArrayListDemo1(143,"Srinu",15000));
		a1.add(new ArrayListDemo1(234,"Rakshi",15000));
		a1.add(new ArrayListDemo1(101,"Rani",123000));
		a1.add(new ArrayListDemo1(102,"Sai",13000));
//		a1.add(1000);
		a1.sort(new ComparatorDemo());                 
		System.out.println(a1);
		ArrayListDemo1 obj=(ArrayListDemo1)a1.get(2);
		System.out.println("Old object value: "+obj);
		obj.setEno(1900);
		obj.setEname("dileep");
		System.out.println("New object value: "+obj);
		System.out.println(obj);
		a1.set(2, "ZERO");
		System.out.println(a1);
		a1.add(3,"Srinu");
		System.out.println(a1);
		Object obj1=a1.remove(4);
		System.out.println(obj1);
		System.out.println("the elements from arraylist collection are");
		Iterator it=a1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
