package com.java.basic.oops.features;
interface Interface2
{
	public void add(int a, int b);
}
public class LambdaFunctionalDemo
{
	public static void main(String[] args)
	{
		Interface2 i=(a,b)->System.out.println(a+b);
		i.add(10, 20);
	}
}
