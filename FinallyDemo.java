package com.java.basic.oops.finallly;
//import java.io.FileReader;
import java.util.Scanner;
public class FinallyDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr= {1,2,3,4,5};
//		try(FileReader fr=new FileReader("abc.txt");)
		try
		{
			arr[0]=100;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("statement from finally block");
		}
		sc.close();
	}

}
