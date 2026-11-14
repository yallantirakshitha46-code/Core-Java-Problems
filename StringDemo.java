package com.java.basic.oops.strings;

public class StringDemo {

	public static void main(String[] args) {
		String str1=new String("chinnu");                //heap area
		String str2="rakshi";                            //string constant pool
		String str3=new String("chinnu");
		String str4="rakshi";
		if(str1.equals(str3))
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("both are not equal");
		}
	}

}