package com.java.basic.oops.synchronization;

public class SynchronizedMethod2 {
	int value;
	boolean available=false;
	synchronized void WriteData(int value)
	{
		try
		{
		while(available)
		{
			wait();
		}
		this.value=value;
		available=true;
		System.out.println("written value: "+value);
		notify();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	synchronized void ReadData()
	{
		try
		{
		while(!available)
		{
			wait();
		}
		int data=value;
		available=false;
		System.out.println("read data: "+data);
		notify();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
