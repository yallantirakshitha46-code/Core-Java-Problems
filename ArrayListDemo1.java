package com.java.basic.oops.arraylist;

public class ArrayListDemo1 {
	private int eno;
	public ArrayListDemo1(int eno, String ename, int esalary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esalary = esalary;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	private String ename;
	private int esalary;
	@Override
	public String toString() {
		return "ArrayListDemo1 [eno=" + eno + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
}
