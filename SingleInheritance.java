package com.java.basic.oops.inheritance;

public class SingleInheritance {
	protected int empno;           //super class variables
	protected float empsal;
	SingleInheritance()         //super class non-parameterized constructor
	{
		empno=1001;
		empsal=10000.90f;
		System.out.println("this is employee class non-parameterized constructor");
	}
	SingleInheritance(int e1,float f1)         //super class parameterized constructor
	{
		empno=1001;
		empsal=10000.90f;
		System.out.println("this is employee class parameterized constructor");
	}
	void display()
	{
		System.out.println("empno: "+empno);
		System.out.println("empsal: "+empsal);
	}
}
