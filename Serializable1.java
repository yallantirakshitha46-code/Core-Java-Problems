package com.java.basic.oops.serializable;

import java.io.Serializable;
import java.util.Scanner;

public class Serializable1 implements Serializable {
	private int eno;
	public Serializable1(int eno,String ename,String edept)
	{
		super();
		this.eno=eno;
		this.ename=ename;
		this.edept=edept;
	}
	transient String ename;
	private String edept;
	static Serializable1 getValues()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of eno: ");
		int eno=sc.nextInt();
		System.out.println("Enter the value of ename: ");
		String ename=sc.next();
		System.out.println("Enter the value of edept: ");
		String edept=sc.next();
		sc.close();
		Serializable1 s1=new Serializable1(eno,ename,edept);
		return s1;
	}
	void display()
	{
		System.out.println(eno);
		System.out.println(ename);
		System.out.println(edept);
	}
}

