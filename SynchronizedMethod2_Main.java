package com.java.basic.oops.synchronization;

public class SynchronizedMethod2_Main {

	public static void main(String[] args) {
		SynchronizedMethod2 s1=new SynchronizedMethod2();
		SynchronizedMethod22 p1=new SynchronizedMethod22(s1);
		SynchronizedMethod222 c1=new SynchronizedMethod222(s1);
		p1.start();
		c1.start();
	}

}
