package com.bnmit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(6, calc.add(2, 4));
        assertEquals(-1, calc.add(2, -3));
        assertEquals(0, calc.add(0, 0));
    }

    @Test
    void testAddOverflow() {
        assertThrows(ArithmeticException.class, () -> {
            calc.add(Integer.MAX_VALUE, 1);
        });
    }

    @Test
    void testSubtract() {
        assertEquals(2, calc.subtract(5, 3));
        assertEquals(-5, calc.subtract(5, 10));
        assertEquals(0, calc.subtract(0, 0));
    }

    @Test
    void testSubtractOverflow() {
        assertThrows(ArithmeticException.class, () -> {
            calc.subtract(Integer.MIN_VALUE, 1);
        });
    }

    @Test
    void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
        assertEquals(0, calc.multiply(5, 0));
        assertEquals(-6, calc.multiply(2, -3));
    }

    @Test
    void testMultiplyOverflow() {
        assertThrows(ArithmeticException.class, () -> {
            calc.multiply(Integer.MAX_VALUE, 2);
        });
    }

    @Test
    void testDivide() {
        assertEquals(2, calc.divide(4, 2));
        assertEquals(-2, calc.divide(4, -2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.divide(5, 0);
        });
    }
}