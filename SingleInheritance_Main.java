package com.java.basic.oops.inheritance;

public class SingleInheritance_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritance1 m1=new SingleInheritance1();                         //sub class object
		m1.display();                                    //calling super class method
		m1.calculateSalary();
		SingleInheritance1 m2=new SingleInheritance1(1100.23f,1400.34f);                         //sub class object
		m2.display();                                    //calling super class method
		m2.calculateSalary();
	}

}
