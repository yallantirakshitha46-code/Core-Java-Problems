package com.java.basic.oops.abstraction;

public class Abstract1 extends Abstract {
	Abstract1()
	{
		System.out.println("sub class rectangle constructor");
	}

	@Override
	void area() 
	{
		int res=len*bre;
		System.out.println("res value: "+res);
	}

}
