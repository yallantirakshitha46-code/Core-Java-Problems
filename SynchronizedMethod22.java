package com.java.basic.oops.synchronization;

public class SynchronizedMethod22 extends Thread{
	SynchronizedMethod2 s1;
	SynchronizedMethod22(SynchronizedMethod2 s1)
	{
		this.s1=s1;
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			s1.WriteData(i);
		}
	}
}
