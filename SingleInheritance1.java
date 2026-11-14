package com.java.basic.oops.inheritance;

public class SingleInheritance1 extends SingleInheritance {
	protected float ta,da;
	SingleInheritance1()                                //non-parameterized constructor
	{
		ta=1200.45f;
		da=1500.50f;
		System.out.println("it is sub class maneger non-parameterized constructor");
	}
	SingleInheritance1(float f1,float f2)
	{
		super(123,3456.56f);       //calling a super class parameterized constructor
		ta=1200.45f;
		da=1500.50f;
		System.out.println("it is sub class maneger parameterized constructor");
	}
	void calculateSalary()
	{
		float netsal=empsal+ta+da;
		System.out.println("netsal: "+netsal);
	}
}
