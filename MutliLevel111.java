package com.java.basic.oops.inheritance;

public class MutliLevel111 extends MutliLevel11 {
	protected int empno;
	protected float empsal;
	MutliLevel111()
	{
		empno=120;;
		empsal=1500.50f;
		System.out.println("it is sub class maneger non-parameterized constructor of employee");
	}
	void show()
	{
		System.out.println(empno);
		System.out.println(empsal);
	}
}
