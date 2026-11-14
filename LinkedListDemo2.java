package com.java.basic.oops.arraylist;

public class LinkedListDemo2 {
	private int proId;
	public LinkedListDemo2(int proId, String proName, int proPrice) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proPrice = proPrice;
	}
	@Override
	public String toString() {
		return "Product1 [proId=" + proId + ", proName=" + proName + ", proPrice=" + proPrice + "]";
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public int getProPrice() {
		return proPrice;
	}
	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}
	private String proName;
	private int proPrice;
}
