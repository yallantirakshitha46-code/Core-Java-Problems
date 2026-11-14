package com.java.basic.oops.exception;

class InsufficientFundsException extends Exception {

    InsufficientFundsException(String str) {
        super(str);
    }
}

public class UserDefinedExceptionThrowsDemo {

    public static void main(String[] args) throws InsufficientFundsException {

        int deposit = 10000;
        int withdraw = 30000;

        if (deposit >= withdraw) {
            int balance = deposit - withdraw;
            System.out.println("Balance amount: " + balance);
        } else {
            throw new InsufficientFundsException("Funds are not available");
        }
    }
}
