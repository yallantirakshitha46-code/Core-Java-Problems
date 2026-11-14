package com.java.basic.oops.exception;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("enter value a: ");
//		int a=sc.nextInt();
//		System.out.println("enter value b: ");
//		int b=sc.nextInt();
//		try
//		{
//		int c=a/b;
//		System.out.println("the value of c is: "+c);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			System.out.println(e);
//			System.out.println("exception raises in try block");
//		}
//		System.out.println("after exception raises");
		
		
		System.out.println("enter the amount: ");
		int amount=sc.nextInt();
		System.out.println("no.of customer: ");
		int cust=sc.nextInt();
		try
		{
			int result=amount/cust;
			System.out.println("the value of result: "+result);
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
			System.out.println("exception raised");
		}
		System.out.println("after exception raised");
		sc.close();
	}

}
