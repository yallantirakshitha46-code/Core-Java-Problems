package com.java.basic.oops.inheritance;

public class Hierarchical11 extends Hierarchical1 {
	Hierarchical11()
	{
		System.out.println("square class constructor");
	}
	void area()
	{
		int res=side*side;
		System.out.println("res: "+res);
	}
}
