package com.java.basic.oops.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Vector;
import java.util.Enumeration;
public class SequenceInputEnumeration {

	public static void main(String[] args) throws Exception{
		FileInputStream fi1=new FileInputStream("abc.txt");
		FileInputStream fi2=new FileInputStream("sample.txt");
		FileInputStream fi3=new FileInputStream("abc1.txt");
		FileOutputStream fo1=new FileOutputStream("xyz.txt");
		Vector v1=new Vector();
		v1.add(fi1);
		v1.add(fi2);
		v1.add(fi3);
		Enumeration e1=v1.elements();
		SequenceInputStream s1=new SequenceInputStream(e1);
		SequenceInputStream s2=new SequenceInputStream(fi1,fi2);
		int n;
		while((n=s1.read())!= -1)
		{
			System.out.println((char)n);
			fo1.write(n);	
		}
		fi1.close();
		fi2.close();
		s1.close();
		fi3.close();
		fo1.close();
	}
}