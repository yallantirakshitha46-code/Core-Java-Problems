package com.java.basic.oops.features;
import java.util.Random;
import java.util.function.*;
public class OTPGneratorRandomDemo {

	public static void main(String[] args) {
//		create a random object
		Random r1=new Random();
//		minimum 6-digit number =100000
//		maximum 6= 999999
//		generate a number from 0 to 899999
		int otp1=100000+r1.nextInt(900000);
		System.out.println(otp1);
		
		
		
		Random r2=new Random();
		Supplier<Integer> otpSupplier=()->
		{
		int otp2=100000 + r2.nextInt(900000);
		return otp2;
	};
	System.out.println("opt1: "+otpSupplier.get());
	System.out.println("opt2: "+otpSupplier.get());
	System.out.println("opt3: "+otpSupplier.get());
}
}