package com.java.basic.oops.trycatch;

import java.util.Scanner;

public class NestedTryCatchFinallyDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value: ");
		int a=sc.nextInt();
		System.out.println("enter b value: ");
		int b=sc.nextInt();
		try
		{
			int c=a/b;
			System.out.println("value c: "+c);
			try
			{
				int[] arr= {1,2,3,4,5};
				arr[10]=100;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ArrayIndexOutOfBoundsException"+e);
			}
			finally
			{
				System.out.println("Inner finally block statement");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException"+e);
		}
		finally
		{
			System.out.println("Outter finally block statement");
		}
		sc.close();
	}
}
