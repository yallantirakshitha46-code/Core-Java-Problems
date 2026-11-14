package com.java.basic.oops.file;
import java.io.File;
public class FileDemo4
{
	public static void main(String[] args)
	{
		File f1=new File("abc.txt");
		boolean value =f1.exists();
		System.out.println(value);
		System.out.println("the file path is: "+f1.getPath());
		System.out.println("the parent file is: "+f1.getParent());
		System.out.println("check readable or writable file is: "+f1.canRead());
		System.out.println("writable file or not: "+f1.canWrite());
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
	}
}