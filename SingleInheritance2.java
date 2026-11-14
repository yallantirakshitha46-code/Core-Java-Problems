package com.java.basic.oops.inheritance;

public class SingleInheritance2 {
	protected float length;
	protected float width;
	SingleInheritance2()
	{
		length=23.5f;
		width=45.3f;
		System.out.println("shape is non-parameterized constructor");
	}
	SingleInheritance2(float f1,float f2)
	{
		length=f1;
		width=f2;
		System.out.println("shape is parameterized constructor");
	}
	void display()
	{
		System.out.println("length: "+length);
		System.out.println("width: "+width);
	}
}
