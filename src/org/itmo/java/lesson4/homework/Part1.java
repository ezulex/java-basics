package org.itmo.java.lesson4.homework;

public class Part1 {
    public static int returnOdd() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
        return 1;
    }

    public static int divThree() {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " Делится на 3 и на 5");
            } else if (i % 5 == 0) {
                System.out.println(i + " Делится на 5");
            } else if (i % 3 == 0) {
                System.out.println(i + " Делится на 3");
            }
        }
        return 1;
    }



    public static void main(String[] args) {
        returnOdd();
        divThree();
    }
}

