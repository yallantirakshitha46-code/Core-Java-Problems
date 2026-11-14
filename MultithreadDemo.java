package com.java.basic.oops.multithreading;

public class MultithreadDemo extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try
			{
			System.out.println(Thread.currentThread().getName() + " "+i);
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
