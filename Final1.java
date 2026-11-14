package com.java.basic.oops.finallly;

public class Final1 {
	protected final int a,b;
	Final1()
	{
		a=100;
		b=200;
		System.out.println("final demo super class constructor");
	}
	void display()
	{
		System.out.println("value a: "+a);
		System.out.println("value b: "+b);
	}
	final void addition()
	{
		System.out.println("addition final method");
	}
}
