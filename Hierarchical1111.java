package com.java.basic.oops.inheritance;

public class Hierarchical1111 extends Hierarchical1 {
	Hierarchical1111()
	{
		System.out.println("circle class constructor");
	}
	void area()
	{
		float res=3.14f*radius*radius;
		System.out.println("res: "+res);
	}
}
