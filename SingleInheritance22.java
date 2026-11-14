package com.java.basic.oops.inheritance;

public class SingleInheritance22 extends SingleInheritance2 {
	protected float height,size;
	SingleInheritance22()
	{
		height=98.2f;
		size=23.8f;
		System.out.println("rectangle is non-parameterized constructor");
	}
	SingleInheritance22(float h1,float s1)
	{
		super(12,345.67f);
		height=h1;
		size=s1;
		System.out.println("rectangle is parameterized constructor");
	}
	void perameter()
	{
		float area=height+size;
		System.out.println("area: "+area);
	}
}
