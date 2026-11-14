package com.java.basic.oops.features;
import java.util.function.Predicate;
import java.util.function.BiPredicate;
public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> isEven=n->n%2==0;
		System.out.println(isEven.test(20));
		
		
		Predicate<Integer> isPassed=marks-> marks>=40;
		System.out.println(isPassed.test(35));
		System.out.println(isPassed.test(55));
		
		
		BiPredicate<Integer,Integer> checkSum=(n1,n2)->(n1+n2)>100;
		System.out.println(checkSum.test(40, 40));
		
		
		BiPredicate<Integer,Integer> isEligible=(age,percentage)-> age>=18 && percentage>=60;
		System.out.println(isEligible.test(16, 75));
		
	}

}
