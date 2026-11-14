package com.java.basic.oops.encapsulation;

public class Encapsulation {
	private int empid;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public float getEmpsal() {
		return empsal;
	}
	public void setEmpsal(float empsal) {
		this.empsal = empsal;
	}
	private float empsal;
	void display()
	{
		System.out.println("empid: "+empid);	
	    System.out.println("empsal: "+empsal);	
	}
}
