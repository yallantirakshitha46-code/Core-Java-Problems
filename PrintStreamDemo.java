package com.java.basic.oops.streams;
import java.io.PrintStream;
public class PrintStreamDemo {

	public static void main(String[] args) {
		PrintStream p1=new PrintStream(System.out);
		p1.println(100);
		p1.println(123.34f);
		p1.println("Hello");
		p1.println(true);
		float f1=100.345f;
		p1.printf("%.2f", f1);
	}

}
