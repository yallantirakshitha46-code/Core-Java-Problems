package com.java.basic.oops.inheritance;

public class Hierarchical1 {
	protected int len,bre,side;
	protected float radius;
	Hierarchical1()
	{
		len=10;
		bre=20;
		side=20;
		radius=20.10f;
		System.out.println("super class shape constructor");
	}
	void display()
	{
		System.out.println("len: "+len);
		System.out.println("bre: "+bre);
		System.out.println("side: "+side);
		System.out.println("radius: "+radius);
	}
}
