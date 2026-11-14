package com.java.basic.oops.interfaces;

public class Interface_Main {

	public static void main(String[] args) {
		Interface1 m1=new Interface1();
		m1.display();
		m1.calculateSalary();
		Interface e1;
		e1=m1;
		e1.display();
		e1.calculateSalary();
	}

}
