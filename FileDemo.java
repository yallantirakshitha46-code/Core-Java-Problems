package com.java.basic.oops.file;
import java.io.File;
import java.io.IOException;
public class FileDemo {
	public static void main(String[] args) throws IOException
	{
		File f1=new File("abc.txt");
		boolean value=f1.exists();
		System.out.println(value);
		boolean b1=f1.createNewFile();
		System.out.println(b1);
	}
}







