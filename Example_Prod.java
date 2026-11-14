package com.java.basic.oops;

public class Example_Prod {
	int productId;
	float productPrice;
	float productQty;
	Example_Prod()   //non-parameterised constructor
	{
		productId=1001;
		productPrice=120.34f;
		productQty=13080f;
		System.out.println("statement from non parameterised constructor");
	}
	Example_Prod(int a,float f1,float f2)   //parameterised constructor
	{
		productId=a;
		productPrice=f1;
		productQty=f2;
		System.out.println("statement from parameterised constructor");
	}
	Example_Prod(Example_Prod p1)   //copy constructor
	{
		productId=p1.productId;
		productPrice=p1.productPrice;
		productQty=p1.productQty;
		System.out.println("statement from copy constructor");
	}
	void display()
	{
		System.out.println(productId);
		System.out.println(productPrice);
		System.out.println(productQty);
	}
}
