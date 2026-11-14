package com.java.basic.oops.interfaces;

public interface Interface2 {
	int len=10;
	int bre=20;
	void area();
	default void perimeter()
	{
		show();
		int res=2*(len+bre);
		System.out.println("res1: "+res);
	}
	static void display()
	{
		System.out.println("rectangle is static");
	}
	private void show()
	{
		System.out.println("rectangle is private");
	}
}
