package com.java.basic.oops.Cursor;
import java.util.Vector;
import java.util.Enumeration;
public class EnumDemo {

	public static void main(String[] args) {
		Vector<String> v1=new Vector<>();
		v1.add("Hyderabad");
		v1.add("Vijayawada");
		v1.add("Nellore");
		v1.add("Kavali");
//		using Enumeration to access the elements.
		Enumeration<String> en=v1.elements();
//		hasMoreElements() checks if and elements exist in vector or not
//		it returns a boolean value true if elements exists.
//		it return false if no element exists. 
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}

}
