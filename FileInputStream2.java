package com.java.basic.oops.streams;

import java.io.FileInputStream;

public class FileInputStream2 {

	public static void main(String[] args) {
		try(FileInputStream f1=new FileInputStream("abc.txt");)
		{
			int n;
			while((n=f1.read())!=-1)
			{
				System.out.println(n);
				System.out.println((char)n);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	}


