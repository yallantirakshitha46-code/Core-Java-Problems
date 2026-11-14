package com.java.basic.oops.abstraction;

public abstract class Abstract {
	protected int len,bre;
	Abstract()                                               //abstract class constructor          
	{
		len=10;
		bre=20;
		System.out.println("abstract class constructor");
	}
	void display()                                               //concrete method
	{
		System.out.println("len: "+len);
		System.out.println("bre: "+bre);
	}
	abstract void area();
	
}
