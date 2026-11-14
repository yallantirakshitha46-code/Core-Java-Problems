package com.java.basic.oops;

public class Example_Prod_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example_Prod p1=new Example_Prod();        //calling non parameterised constructor
		p1.display();
		Example_Prod p2=new Example_Prod(100,123.4f,120.7f);          //calling parameterised constructor
		p2.display();
		Example_Prod p3=new Example_Prod(p1);    //calling copy constructor
		p3.display();
	}

}
