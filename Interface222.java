package com.java.basic.oops.interfaces;

public class Interface222 implements Interface2, Interface22 {
	@Override
	public void area()
	{
		int res1=len*bre;
		float res2=3.14f*radius*radius;
		System.out.println("res1 value: "+res1);
		System.out.println("res2 value: "+res2);
	}
	@Override
	public void perimeter()
	{
		Interface2.super.perimeter();
		Interface22.super.perimeter();
		Interface2.display();
		Interface22.display();
	}
	
}
