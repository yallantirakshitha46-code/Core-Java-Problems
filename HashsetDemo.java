package com.java.basic.oops.set;
import java.util.HashSet;
public class HashsetDemo {
	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<>();
		hs.add("Hyderabad");
		hs.add("Kavali");
		hs.add("Vijayawada");
		hs.add("Nellore");
		hs.add(null);
		hs.add("Kavali");
		System.out.println(hs);
	}
}
