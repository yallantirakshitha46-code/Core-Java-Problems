package com.java.basic.oops.queue;
import java.util.PriorityQueue;
public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> p1=new PriorityQueue<>();
		p1.add(10);
		p1.add(20);
		p1.add(40);
		p1.add(30);
		p1.add(40);
		p1.add(50);
		System.out.println(p1);
//		peek() method
		System.out.println(p1.peek());
//		poll() method
		System.out.println(p1.poll());
		System.out.println(p1);
	}

}
