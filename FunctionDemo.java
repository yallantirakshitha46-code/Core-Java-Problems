package com.java.basic.oops.features;
import java.util.function.Function;
public class FunctionDemo {

	public static void main(String[] args) {
//		function<Inputtype,returnType>
//		Function to calculate the square of a number
		Function<Integer,Integer> square=n->n*n;
		System.out.println(square.apply(12));
//		calculate the final salary after 10% increment
		Function<Double,Double> calculateSalary=salary-> salary+(salary*0.10);
		double calculatedSalary=calculateSalary.apply(40000.23);
		System.out.println("Incremented salary: "+calculatedSalary);
		
		Function<Integer,String> calculateGrade= marks->{
				if(marks<0 || marks>300)
					return "Invalid marks";
				else if(marks>=90)
					return "A";
				else if(marks>=75)
					return "B";
				else if(marks>=60)
					return "C";
				else if(marks>40)
					return "D";
				else
					return "Fail";
		};
		System.out.println(calculateGrade.apply(95));
		System.out.println(calculateGrade.apply(85));
		System.out.println(calculateGrade.apply(35));
	}
}

