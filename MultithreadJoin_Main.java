package com.java.basic.oops.multithreading;

public class MultithreadJoin_Main {

	public static void main(String[] args) {
		MultithreadJoin j1=new MultithreadJoin();
		MultithreadJoin j2=new MultithreadJoin();
		j1.setName("thread1");
		j2.setName("thread2");
		j1.start();
		try
		{
			j1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		j2.start();
	}

}
