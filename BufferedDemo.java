package com.java.basic.oops.streams;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class BufferedDemo {

	public static void main(String[] args) {
		try
		{
			FileReader fr=new FileReader("abc.txt");
			BufferedReader br=new BufferedReader(fr);
			FileWriter fw=new FileWriter("xyz.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			long l1=System.nanoTime();
			int n;
			while((n=br.read())!= -1)
			{
				bw.write(n);
			}
			long l2=System.nanoTime();
			System.out.println("Time taken"+(l2-l1));
			br.close();
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
