package org.itmo.java.lesson4.homework;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part1 {
    public static void returnOdd() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void divThree() {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " Делится на 3");
                if (i % 5 == 0 ) {
                    System.out.println(i + " Делится на 5");
                    System.out.println(i + " Делится на 3 и на 5");
                }
            } else if (i % 5 == 0) {
                System.out.println(i + " Делится на 5");
            }
        }
    }

    public static boolean checkSumTwo() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число: ");
        int a = Integer.parseInt(reader.readLine());

        System.out.println("Введите второе число: ");
        int b = Integer.parseInt(reader.readLine());

        System.out.println("Введите третье число: ");
        int c = Integer.parseInt(reader.readLine());

        if((a + b) == c) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }

    public static boolean checkSumThree() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число: ");
        int a = Integer.parseInt(reader.readLine());

        System.out.println("Введите второе число: ");
        int b = Integer.parseInt(reader.readLine());

        System.out.println("Введите третье число: ");
        int c = Integer.parseInt(reader.readLine());

        if(b > a && c > b) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }

    public static boolean threeInArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите размерность массива: ");
        int arrayLength = Integer.parseInt(reader.readLine());

        int[] arr = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Введите следующий элемент: ");
            arr[i] = Integer.parseInt(reader.readLine());
        }

        if (arr[0] == 3 || arr[arrayLength - 1] == 3) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }

    }

    public static boolean oneOrThreeInArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите размерность массива: ");
        int arrayLength = Integer.parseInt(reader.readLine());

        int[] arr = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Введите следующий элемент: ");
            arr[i] = Integer.parseInt(reader.readLine());
            if (arr[i] == 1 || arr[i] == 3) {
                System.out.println("True");
                break;
            } else {
                continue;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
//        returnOdd();
//        divThree();
//        Part1.checkSumTwo();
//        Part1.checkSumThree();
//        Part1.threeInArray();
        Part1.oneOrThreeInArray();



    }
}

