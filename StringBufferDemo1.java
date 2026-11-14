package com.java.basic.oops.strings;

public class StringBufferDemo1 {

	public static void main(String[] args) {
		StringBuffer str1=new StringBuffer("codegnan");
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3,7));
		System.out.println(str1.toString());                           //immutable object
		str1.setCharAt(0 , 'C');
		System.out.println(str1);
		System.out.println(str1.delete(4, 8));
		System.out.println(str1.reverse());
	}

}
