package com.java.basic.oops.strings;

public class StringBufferDemo {
	public static void main(String[] args)
	{
//		StringBuffer str1=new StringBuffer();                      
//		System.out.println("Capacity: " +str1.capacity());                       //using "append" method
//		System.out.println("Length: " +str1.length());
//		str1.append("codegnan");
//		System.out.println("Capacity: " +str1.capacity());
//		System.out.println("Length: " +str1.length());
		
		
//		StringBuffer str1=new StringBuffer();                      //capacity=16   ;   length=0
//		System.out.println("Capacity: " +str1.capacity());
//		System.out.println("Length: " +str1.length());
		
		
//		StringBuffer str1=new StringBuffer();                      
//		System.out.println("Capacity: " +str1.capacity());
//		System.out.println("Length: " +str1.length());
//		str1.append("codegnan");                                                       
//		System.out.println("Capacity: " +str1.capacity());
//		System.out.println("Length: " +str1.length());
//		str1.trimToSize();                                                              //using "trimToSize" method
//		System.out.println("Capacity: " +str1.capacity());
//		System.out.println("Length: " +str1.length());
		
		
//		StringBuffer str1=new StringBuffer(10);                                //capacity=10   ;   length=0
//		System.out.println("Capacity: " +str1.capacity());
//		System.out.println("Length: " +str1.length());
//		str1.append("codegnan");                                                       
//		System.out.println("Capacity: " +str1.capacity());
//		System.out.println("Length: " +str1.length());
//		str1.trimToSize();                                                              //using "trimToSize" method
//		System.out.println("Capacity: " +str1.capacity());
//		System.out.println("Length: " +str1.length());
		
		
		StringBuffer str1=new StringBuffer("codegnan");                                //capacity=16+length of string
		System.out.println("Capacity: " +str1.capacity());
		System.out.println("Length: " +str1.length());
		str1.append("codegnan");                                                       
		System.out.println("Capacity: " +str1.capacity());
		System.out.println("Length: " +str1.length());
		str1.trimToSize();                                                              //using "trimToSize" method
		System.out.println("Capacity: " +str1.capacity());
		System.out.println("Length: " +str1.length());
		
		
	}
}
