package com.java.basic.oops.features;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
//		consumer accepts a double value
//		and does not return anything
		Consumer<Double> salaryConsumer=salary->
		{
//			calculate 10% bonus
			double bonus=salary*0.10;
//			calculate total salary
			double totalSalary=salary+bonus;
//			display salary details
			System.out.println("Basic Salary: "+salary);
			System.out.println("Bonus: "+bonus);
			System.out.println("Total salary: "+totalSalary);
		};
//		invoke the accept() method
		salaryConsumer.accept(5000.0);
	}

}
