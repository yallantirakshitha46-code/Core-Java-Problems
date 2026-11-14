package com.java.basic.oops;

import java.util.Objects;

public class Student {
	private int stuid;
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public int getStumarks() {
		return stumarks;
	}
	public void setStumarks(int stumarks) {
		this.stumarks = stumarks;
	}
	private int stumarks;
	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", stumarks=" + stumarks + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(stuid), Integer.valueOf(stumarks));
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return stuid == other.stuid && stumarks == other.stumarks;
	}
}
 