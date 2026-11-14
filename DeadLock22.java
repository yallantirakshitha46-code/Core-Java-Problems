package com.java.basic.oops.deadlock;

public class DeadLock22 {
	synchronized void CallMe(DeadLock2 c1)
	{
		System.out.println("DeadLock22 thread");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		c1.display();
	}
	synchronized void show()
	{
		System.out.println("show method from DeadLock22");
	}
}
