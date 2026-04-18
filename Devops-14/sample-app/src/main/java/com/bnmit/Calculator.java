package com.bnmit;

public class Calculator {

    public int add(int a, int b) {
        return Math.addExact(a, b); // handles overflow
    }

    public int subtract(int a, int b) {
        return Math.subtractExact(a, b); // handles overflow
    }

    public int multiply(int a, int b) {
        return Math.multiplyExact(a, b); // handles overflow
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}