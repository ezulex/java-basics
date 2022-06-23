package org.itmo.java.lesson3;

public class Main {
    public static void main(String[] args) {
        Sun sun = Sun.getSun();
        sun.setSize(123);
        sun.setColor("White");



        Sun sun2 = Sun.getSun();
        sun2.setSize(777);
        sun2.setColor("Black");

        System.out.println(sun);
        System.out.println(sun2);
    }
}
