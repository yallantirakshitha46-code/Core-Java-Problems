package com.java.basic.oops.inheritance;

public class MutliLevel11 extends MutliLevel1 {
	protected int deptid;
	protected String deptname;;
	MutliLevel11()
	{
		deptid=1001;
		deptname="rakshi";
		System.out.println("employee class is non parameterized constructor");
	}
	void display()
	{
		System.out.println("companyid: "+companyid);
		System.out.println("companyname: "+companyname);
		System.out.println("empno: "+deptid);
		System.out.println("empsal: "+deptname);
	}
}
