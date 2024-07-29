package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 1));
        System.out.println(calculator.subtract(23, 52));
        System.out.println(calculator.multiply(34, 2));
        System.out.println(calculator.divide(12, 3));
        System.out.println(calculator.modulo(12, 5));
        System.out.println(calculator.power(2, 3));
        System.out.println("Hello World!");
    }
}