package com.java.basic.oops.deadlock;

public class DeadLock1 {
	synchronized void display(DeadLock11 t2)
	{
		System.out.println(Thread.currentThread().getName()+"child1 Entered");
		t2.last();
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	synchronized void last()
	{
		System.out.println("trying to call thread1 class last method");
	}
}
