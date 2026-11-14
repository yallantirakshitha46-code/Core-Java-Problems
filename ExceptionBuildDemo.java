package com.java.basic.oops.exception;

public class ExceptionBuildDemo {

	public static void main(String[] args) {
	String[] products= {"laptops","mouses","pendrives","ram"};
	int noofproducts=products.length;
	Integer quantity=null;
	try
	{
		System.out.println(products[5]);
		int total=noofproducts * quantity;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutOfBoundsException raises");
	}
	catch(Exception e)
	{
		System.out.println("Exception raise");
		System.out.println(e);
	}
	}

}
