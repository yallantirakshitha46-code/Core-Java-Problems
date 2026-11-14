package com.java.basic.oops.trycatch;

public class StaticTryCatchDemo {
	static
	{
		int a=10;
		int b=5;
		try
		{
			int c=a/b;
			System.out.println("c value: "+c);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println("after exception raises");
	}

}
