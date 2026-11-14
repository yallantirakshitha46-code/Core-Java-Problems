package com.java.basic.oops.interfaces;

public interface Interface22 {
	float radius=10.23f;
	void area();
	default void perimeter()
	{
		show();
		float res=2*3.14f*radius;
		System.out.println("res2: "+res);
	}
	static void display()
	{
		System.out.println("circle is static");
	}
	private void show()
	{
		System.out.println("circle is private");
	}
}
