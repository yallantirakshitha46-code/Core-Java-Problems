package com.java.basic.oops.synchronization;

public class SynchronizedMethod222 extends Thread{
	SynchronizedMethod2 s1;
	SynchronizedMethod222(SynchronizedMethod2 s1)
	{
		this.s1=s1;
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			s1.ReadData();
		}
	}
}
