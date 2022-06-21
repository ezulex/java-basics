package org.itmo.java.lesson1;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        byte b = 100;
        short s = 123;
        int i = 500;
        long l = 5000000000L;
        float f = 12.3f;
        double d = 14.5d;

        char c = 'a';
        boolean isTrue = true;

        int r = (b + i);
        System.out.println(r);

        long q = b + i;
        System.out.println(q);

        if (true) {
            //logic
        } else if (false) {
            //logic
        }

        String str = new String("А по-русски");
        System.out.println(str);
    }
}
