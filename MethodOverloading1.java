package com.java.basic.oops.methodoverloading;

public class MethodOverloading1 {
	private int salary;
	MethodOverloading1()
	{
		salary=50000;
		System.out.println("salary of constructor");
	}
	void display()
	{
		int res=salary;
		System.out.println("salary value: "+res);
	}
	int display(int ta,int da,int sal) 
	{
		int res=ta+da*sal;
		return res;
	}
}
