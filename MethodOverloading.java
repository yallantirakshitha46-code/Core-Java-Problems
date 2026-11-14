package com.java.basic.oops.methodoverloading;

public class MethodOverloading {
	private int side;
	MethodOverloading()
	{
		side=10;
		System.out.println("shape class constructor");
	}
	void area()
	{
		int res=side*side;
		System.out.println("square res value: "+res);
	}
	int area(int len,int bre)
	{
		int res=len*bre;
		return res;
	}
	void area(float radius)
	{
		float res=3.14f*radius*radius;
		System.out.println("circle res value: "+res);
	}
}
