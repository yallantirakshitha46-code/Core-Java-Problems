package com.java.basic.oops.abstraction;

public class Abstract_Main {

	public static void main(String[] args) {
		Abstract1 a1=new Abstract1();
		a1.display();                              //calling super class method
		a1.area();                                 //calling sub class method
		Abstract a2;                              //super class reference variable a2=null    
		a2=a1;                                   //assigning sub class variable to the super class variable
		a2.display();                            
		a2.area();
	}

}
