package com.java.basic.oops.multithreading;

public class MultithreadDemo_Main {

	public static void main(String[] args) {
		MultithreadDemo m1=new MultithreadDemo();
		MultithreadDemo m2=new MultithreadDemo();
		m1.setName("rakshi...");
		m2.setName("chinnu...");
		m1.setPriority(10);
		m2.setPriority(1);
		m1.start();
		m2.start();
	}

}
