package com.java.basic.oops.features;
import java.util.function.*;
class Student
{
	String name;
	Student()
	{
		name="ravi";
	}
	void display()
	{
		System.out.println("Student name: "+name);
	}
}
public class SupplierFunctionDemo {

	public static void main(String[] args) {
		Supplier<Student> s1=()-> new Student();
		Student student=s1.get();
		student.display();
	}

}
