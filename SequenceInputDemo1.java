package com.java.basic.oops.streams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
public class SequenceInputDemo1 {

	public static void main(String[] args) throws Exception{
		FileInputStream f1=new FileInputStream("abc.txt");
		FileInputStream f2=new FileInputStream("sample.txt");
		FileOutputStream f3=new FileOutputStream("xyz.txt");
		SequenceInputStream s1=new SequenceInputStream(f1,f2);
		int n;
		while((n=s1.read())!= -1)
		{
			System.out.println((char)n);
			f3.write(n);	
		}
		f1.close();
		f2.close();
		s1.close();
		f3.close();
	}

}
