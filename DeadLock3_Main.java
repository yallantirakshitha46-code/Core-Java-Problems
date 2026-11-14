package com.java.basic.oops.deadlock;

public class DeadLock3_Main extends Thread{
		DeadLock3 d1=new DeadLock3();
		DeadLock33 d2=new DeadLock33();
		DeadLock3_Main()
		{
			System.out.println("Main Thread");
			start();
			d1.JavaBookReceived(d2);
		}
		public void run()
		{
			d2.SqlBookReceived(d1);
		}
		public static void main(String[] args) {
			new DeadLock3_Main();
	}

}
