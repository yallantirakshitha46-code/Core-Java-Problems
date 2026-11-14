package com.java.basic.oops.features;
import java.util.function.*;
public class FunctionChainingDemo {

	public static void main(String[] args) {
//		function to multiply by 2
		Function<Integer,Integer> multiply=n->n*2;
//		add 10
		Function<Integer,Integer> add=n-> n+10;
//		using andthen()
		int result1=multiply.andThen(add).apply(3);
//		multiply produced 3*2=6
//		6 is passed add,add added 10 to 6.     10+6=16
		System.out.println(result1);
//		using composse()
		int result2=multiply.compose(add).apply(3);
//		add:3+10=13
//		multiply: 13*2=26
		System.out.println(result2);
	}

}
