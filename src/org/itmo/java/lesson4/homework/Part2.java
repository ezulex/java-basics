package org.itmo.java.lesson4.homework;

import org.itmo.java.lesson4.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Part2 {

    public static void checkSortArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите размерность массива: ");
        int arrayLength = Integer.parseInt(reader.readLine());

        int[] arr = new int[arrayLength];
        int[] arr1 = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Введите следующий элемент: ");
            arr[i] = Integer.parseInt(reader.readLine());
            arr1[i] = arr[i];
        }

        Arrays.sort(arr);

        Boolean result = Arrays.equals(arr, arr1);
        System.out.println(result);
    }

    public static void returnArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите размерность массива: ");
        int arrayLength = Integer.parseInt(reader.readLine());

        int[] arr = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Введите следующий элемент: ");
            arr[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void changeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите размерность массива: ");
        int arrayLength = Integer.parseInt(reader.readLine());

        int[] arr = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Введите следующий элемент: ");
            arr[i] = Integer.parseInt(reader.readLine());
        }

        int bufA = arr[0];
        int bufB = arr[arr.length - 1];

        arr[0] = bufB;
        arr[arrayLength -1] = bufA;

        System.out.println(Arrays.toString(arr));
    }

    public static void uniqArrayIndex() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите размерность массива: ");
        int arrayLength = Integer.parseInt(reader.readLine());

        int[] arr = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Введите следующий элемент: ");
            arr[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < arr.length; i++) {

        }
    }


    public static void main(String[] args) throws IOException {
//        Part2.checkSortArray();
//        Part2.returnArray();
        Part2.changeArray();
    }
}
