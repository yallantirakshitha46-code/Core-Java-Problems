package com.java.basic.oops.methodoverriding;

public class MethodOverriding11 extends MethodOverriding1 {
	protected float ta,da;
	MethodOverriding11()
	{
		ta=1000.43f;
		da=2345.23f;
		System.out.println("sub class constructor");
	}
	@Override
	public void calculateSalary()        //overridding method
	{
		float netsal=empsal+da+ta;
		System.out.println("employee salary: "+netsal);
	}
}
