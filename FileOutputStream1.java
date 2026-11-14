package com.java.basic.oops.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStream1 {

	public static void main(String[] args) {
		try
		{
			FileInputStream f1=new FileInputStream("abc.txt");       
			FileOutputStream f2=new FileOutputStream("xyz.txt",false);     
			int n;
			while((n=f1.read())!=-1)
			{
				System.out.println(n);
				System.out.println((char)n);
				f2.write(n);
			}
			f1.close();
			f2.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	}