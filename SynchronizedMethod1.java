package com.java.basic.oops.synchronization;

public class SynchronizedMethod1 extends Thread {
	SynchronizedMethod account;
	SynchronizedMethod1(SynchronizedMethod account)
	{
		this.account=account;
	}
	public void run()
	{
		account.withdraw(10000);
	}
}
