package ru.mmishaev;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculator works!");
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b);
        calc.println.accept(c);
    }
}