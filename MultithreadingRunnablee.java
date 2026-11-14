package com.java.basic.oops.multithreading;

public class MultithreadingRunnablee implements Runnable {

	@Override
	public void run() {
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("value of i: "+i);
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
