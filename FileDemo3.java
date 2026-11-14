package com.java.basic.oops.file;

import java.io.File;
import java.io.IOException;
public class FileDemo3 {
	public static void main(String[] args) throws IOException
	{
		File f1=new File("abc");
		boolean value=f1.exists();
		System.out.println(value);
		boolean option=f1.mkdir();
		System.out.println(option);
	}

}
