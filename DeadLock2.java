package com.java.basic.oops.deadlock;

public class DeadLock2 {
	synchronized void CallMe(DeadLock22 c2)
	{
		System.out.println("DeadLock2 thread");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		c2.show();
	}
synchronized void display()
{
	System.out.println("display method from DeadLock2");
}
}