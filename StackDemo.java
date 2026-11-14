package com.java.basic.oops.Stack;
import java.util.Stack;
public class StackDemo {
	public static void main(String[] args)
	{
		Stack<Integer> st=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st);
		for(Integer element:st)
		{
			System.out.println(element);
		}
		System.out.println("Before pop:");
		for(Integer element:st)
		{
			System.out.println(element);
		}
		System.out.println();
	}
}
