package org.itmo.java.lesson9.homework;

import java.util.*;

public class Main {
    public static Collection getUniqList(Collection collection) {
        return new HashSet<>(collection);
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("250");
        strings.add("250");
        strings.add("123");
        strings.add("123");
        strings.add("123");
        strings.add("Имя");
        strings.add("Имя");
        strings.add("фамилия");
        strings.add("фамилия");
        strings.add("фамилия");

        List<Integer> integers = new ArrayList<>();
        integers.add(123);
        integers.add(123);
        integers.add(56456);
        integers.add(56456);
        integers.add(56456);
        integers.add(4646);
        integers.add(4646);
        integers.add(4556);
        integers.add(46);
        integers.add(46);
        integers.add(46);

        System.out.println(getUniqList(strings));
        System.out.println(getUniqList(integers));
    }
}
