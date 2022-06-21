package org.itmo.java.lesson2.homework;

public class Calculator {
    public static double sum(double a, double b) {
        return a + b;
    }
    public static double sum(long a, long b) {
        return a + b;
    }
    public static double sum(int a, int b) {
        return a + b;
    }

    public static double div(double a, double b) {
        return (double)a / b;
    }
    public static double div(long a, long b) {
        return (double)a / b;
    }
    public static double div(int a, int b) {
        return (double)a / b;
    }

    public static double mult(double a, double b) {
        return a * b;
    }
    public static double mult(long a, long b) {
        return a * b;
    }
    public static double mult(int a, int b) {
        return a * b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }
    public static double sub(long a, long b) {
        return a - b;
    }
    public static double sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println(Calculator.sum(1, 2));
        System.out.println(Calculator.sum(3, 4));
        System.out.println(Calculator.sum(1.5, 3.4));

        System.out.println(Calculator.div(1, 2));
        System.out.println(Calculator.div(3, 4));
        System.out.println(Calculator.div(1.5, 3.4));

        System.out.println(Calculator.mult(1, 2));
        System.out.println(Calculator.mult(3, 4));
        System.out.println(Calculator.mult(1.5, 3.4));

        System.out.println(Calculator.sub(1, 2));
        System.out.println(Calculator.sub(3, 4));
        System.out.println(Calculator.sub(1.5, 3.4));
    }
}
