package org.itmo.java.lesson1;

import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        // First case
        String firstWord = "Я";
        String secondWord = "хорошо";
        String thirdWord = "знаю";
        String forthWord = "Java.";
        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);
        System.out.println(forthWord);

        // Second case
        double result1 = (46 + 10) * ( (double) 10 / 3);
        int result2 = (29) * (4) * (-15);
        System.out.println(result1);
        System.out.println(result2);

        // Third case
        int number = 10500;
        double result = ((double) number / 10) / 10;
        System.out.println(result);

        // Fourth case
        double firstDigit = 3.6;
        double secondDigit = 4.1;
        double thirdDigit = 5.9;
        double result3 = firstDigit * secondDigit * thirdDigit;
        System.out.println(result3);

        // Fifth case
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A:");
        int a = scanner.nextInt();
        System.out.println("Enter B:");
        int bb = scanner.nextInt();
        System.out.println("Enter C:");
        int c = scanner.nextInt();
        System.out.println(a);
        System.out.println(bb);
        System.out.println(c);

        // Sixth case
        System.out.println("Enter B:");
        int b = scanner.nextInt();

        if (b % 2 != 0) {
            System.out.println("Odd");
        } else if (b > 100) {
            System.out.println("Out of range");
        } else {
            System.out.println("Even");
        }

        System.out.println("New branch");

    }
}
