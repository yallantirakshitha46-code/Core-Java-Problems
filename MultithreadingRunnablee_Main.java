package com.java.basic.oops.multithreading;

public class MultithreadingRunnablee_Main {

	public static void main(String[] args) {
		MultithreadingRunnablee m1=new MultithreadingRunnablee();
		Thread t1=new Thread(m1);
		t1.start();
		m1.run();
	}

}
