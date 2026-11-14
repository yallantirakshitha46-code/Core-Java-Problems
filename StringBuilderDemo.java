package com.java.basic.oops.strings;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder str1=new StringBuilder("codegnan");
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3,7));
		System.out.println(str1.toString());                           //immutable object
		str1.setCharAt(0 , 'C');
		System.out.println(str1);
		System.out.println(str1.delete(4, 8));
		System.out.println(str1.reverse());
	}

}
