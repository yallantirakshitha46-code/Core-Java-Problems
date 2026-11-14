package com.java.basic.oops.deadlock;

public class DeadLock1_Main extends Thread{
	DeadLock1 d1=new DeadLock1();
	DeadLock11 d2=new DeadLock11();
	DeadLock1_Main()
	{
		System.out.println(Thread.currentThread().getName()+"thread entered");
		start();
		d2.display(d1);
	}
	public void run()
	{
		d1.display(d2);
	}
	public static void main(String[] args) {
		new DeadLock1_Main();
	}
}
