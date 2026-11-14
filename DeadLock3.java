package com.java.basic.oops.deadlock;

public class DeadLock3 {
	synchronized void JavaBookReceived(DeadLock33 s2)
	{
		String name=Thread.currentThread().getName();
		System.out.println(name +"Thread Entered");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		s2.JBookReceived();
	}
	synchronized void SBookReceived()
	{
		System.out.println("student1 SQL block statement");
	}
}
