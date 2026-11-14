package com.java.basic.oops.queue;
import java.util.LinkedList;
import java.util.Queue;
public class LinkedlistDemo {

	public static void main(String[] args) {
		Queue<String> q1=new LinkedList<>();
//		adding customer in queue
		q1.offer("Ravi");
		q1.offer("Priya");
		q1.offer("Amit");
		q1.offer("Sneha");
		q1.offer("Meena");
//		display the customer in queue
		System.out.println("waiting customers: "+ q1);
//		check the next customer in queue
		System.out.println("next customer: "+ q1.peek());
//		serving the next customer
		System.out.println("serving: "+ q1.poll());
//		display/count the waiting customer
		System.out.println("customer waiting: "+ q1.size());
//		check queue status
		System.out.println("is customer queue empty? "+ q1.isEmpty());
//		display the next customer
		System.out.println("next customer? "+ q1.peek());
	}

}
