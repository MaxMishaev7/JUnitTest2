package ru.mmishaev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalculatorTest {
public static int countTest = 0;

    @BeforeEach
    void startNewTest() {
        CalculatorTest.countTest++;
        System.out.println("Starting Test: " + countTest);
    }

    @Test
    void plusTest() {
      final int a = 1;
      final int b = 2;
      final int expected = 3;
      final int actual = Calculator.instance.get().plus.apply(1, 2);
      Assertions.assertEquals(expected, actual);
    }

    @Test
    void minusTest() {
        final int a = 1;
        final int b = 1;
        final int expected = 0;
        final int actual = Calculator.instance.get().minus.apply(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void divideTest() {
        final int a = 3;
        final int b = 3;
        final int expected = 1;
        final int actual = Calculator.instance.get().divide.apply(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void divideTestDivisionByZero() {
        final int a = 3;
        final int b = 0;
        final int expected = 0;
        final int actual = Calculator.instance.get().divide.apply(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void absTestPositive() {
        final int a = 1;
        final int expected = 1;
        final int actual = Calculator.instance.get().abs.apply(a);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void absTestNegative() {
        final int a = -1;
        final int expected = 1;
        final int actual = Calculator.instance.get().abs.apply(a);
        Assertions.assertEquals(expected, actual);
    }
}