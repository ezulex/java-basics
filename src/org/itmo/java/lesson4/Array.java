package org.itmo.java.lesson4;

import org.itmo.java.lesson3.homework.Car;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] intArray = new int[10];

        intArray[0] = 20;
        intArray[1] = 23;
        intArray[2] = 202;
        intArray[3] = 240;
        intArray[4] = 15;
        intArray[5] = 65;

        System.out.println(Arrays.toString(intArray));

        String[] strings = new String[5];
        System.out.println(Arrays.toString(strings));

        long[] l = new long[]{123L, 15L, 22L};
        System.out.println(Arrays.toString(l));

        Car[] cars = new Car[1];
        cars[0] = new Car("Black", 3500);
        System.out.println(Arrays.toString(cars));
    }
}
