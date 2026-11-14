package com.java.basic.oops.multithreading;

public class MutlithreadCurrentDemo {
	public static void main(String[] args)
	{
		Thread t1=Thread.currentThread();
		System.out.println(t1);
		t1.setName("thread");
		t1.setPriority(1);
		System.out.println(t1);
	}
}
