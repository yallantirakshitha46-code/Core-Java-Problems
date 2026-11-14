package com.java.basic.oops.exception;
class InSufficientFundsException extends Exception
{
	InSufficientFundsException(String str)
	{
		super(str);
	}
}
public class UserDefinedExceptionThrowDemo {
	public static void main(String[] args) {
		int deposit=10000;
		int withdraw=30000;
		if(deposit>=withdraw)
		{
			int balance=deposit-withdraw;
			System.out.println("balance amount: "+balance);
		}
		else
		{
			try
			{
			InSufficientFundsException funds=new InSufficientFundsException("Funds are not avalible");
			throw funds;
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
