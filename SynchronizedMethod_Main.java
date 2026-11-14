package com.java.basic.oops.synchronization;

public class SynchronizedMethod_Main {

	public static void main(String[] args) {
		SynchronizedMethod s1=new SynchronizedMethod();
		SynchronizedMethod1 s2=new SynchronizedMethod1(s1);
		SynchronizedMethod1 s3=new SynchronizedMethod1(s1);
		s2.setName("thread1");
		s3.setName("thread2");
		s2.start();
		s3.start();
	}

}
