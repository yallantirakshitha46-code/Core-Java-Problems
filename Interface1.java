package com.java.basic.oops.interfaces;

public class Interface1 implements Interface {
	int ta,da;
	Interface1()
	{
		ta=1000;
		da=2000;
		System.out.println("maneger class constructor");
	}
	@Override
	public void display()
	{
		System.out.println("empno: "+empno);
		System.out.println("empsal: "+empsal);
	}
	@Override
	public void calculateSalary()
	{
		int netsal=ta+da+empsal;
		System.out.println("empsal: "+empsal);
	}
}
