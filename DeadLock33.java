package com.java.basic.oops.deadlock;

public class DeadLock33 {
	synchronized void SqlBookReceived(DeadLock3 s1)
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
		s1.SBookReceived();
	}
	synchronized void JBookReceived()
	{
		System.out.println("student2 JAVA block statement");
	}
}
