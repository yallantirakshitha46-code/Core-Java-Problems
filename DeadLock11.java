package com.java.basic.oops.deadlock;

public class DeadLock11 {
	synchronized void display(DeadLock1 t1)
	{
		System.out.println(Thread.currentThread().getName()+"child2 Entered");
		t1.last();
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
		System.out.println("trying to call thread2 class last method");
	}
}


