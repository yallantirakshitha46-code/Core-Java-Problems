package com.java.basic.oops.features;
import java.util.function.BiFunction;
public class BiFunctionDemo {

	public static void main(String[] args) {
		BiFunction<Double,Double,Double> calculateBill=(price,gst)->price+(price*gst/100);
		System.out.println(calculateBill.apply(1000.0,18.0));
		System.out.println(calculateBill.apply(2000.0,5.0));
	}

}
