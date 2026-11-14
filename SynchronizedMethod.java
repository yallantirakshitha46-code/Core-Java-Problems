package com.java.basic.oops.synchronization;

public class SynchronizedMethod {
	int balance=10000;
	void withdraw(int amount)
	{
		if(balance>=amount) 
		{
			balance=balance-amount;
			System.out.println(Thread.currentThread().getName() + "is withdrawing amount"+amount);
			System.out.println("balance amount: "+balance);			
		}
		else
		{
			System.out.println("funds are insufficient");
		}
	}
}
