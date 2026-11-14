package com.java.basic.oops.deadlock;

public class DeadLock2_Main extends Thread{
	DeadLock2 d1=new DeadLock2();
	DeadLock22 d2=new DeadLock22();
	DeadLock2_Main()
	{
		System.out.println("Main thread");
		start();
		d1.CallMe(d2);
	}
	public void run()
	{
		d2.CallMe(d1);
	}
	public static void main(String[] args) {
		new DeadLock2_Main();
	}

}
