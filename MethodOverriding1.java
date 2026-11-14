package com.java.basic.oops.methodoverriding;

public class MethodOverriding1 {
	protected int empid;
	protected float empsal;
	MethodOverriding1()
	{
		empid=1001;
		empsal=1200.67f;
		System.out.println("super class constructor");
	}
	void calculateSalary()          //overridden method
	{
		System.out.println("salary of employee: "+empsal);
	}
}
