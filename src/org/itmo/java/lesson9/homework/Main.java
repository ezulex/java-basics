package org.itmo.java.lesson9.homework;

import java.util.*;

public class Main {
    /**
     * First
     */
    public static Collection<Object> getUniqList(Collection collection) {
        return new HashSet<Object>(collection);
    }

    /**
     *
     * Second
     */
    public static List<Integer> addArrayList() {
        long startTime = System.currentTimeMillis();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            int ran = (int) (Math.random() * 1000);
            integers.add(ran);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Миллион записей в ArrayList добавились за: " + (endTime-startTime) + "мс");
        return integers;
    }
    public static List<Integer> addLinkedList() {
        long startTime = System.currentTimeMillis();
        List<Integer> integers = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            int ran = (int) (Math.random() * 1000);
            integers.add(ran);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Миллион записей в LinkedList добавились за: " + (endTime-startTime) + "мс");
        return integers;
    }
    public static void chooseFromArrayList(List arrayList) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            int ran = (int) (Math.random() * 1000000);
            arrayList.get(ran);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Миллион случайных выборок из ArrayList получили за: " + (endTime-startTime) + "мс");
    }
    public static void chooseFromLinkedList(List linkedList) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            int ran = (int) (Math.random() * 1000000);
            linkedList.get(ran);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Миллион случайных выборок из LinkedList получили за: " + (endTime-startTime) + "мс");
    }

    public static void chooseNormFromArrayList(List arrayList) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Миллион выборок по порядку из ArrayList получили за: " + (endTime-startTime) + "мс");
    }
    public static void chooseNormFromLinkedList(List linkedList) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Миллион выборок по порядку из LinkedList получили за: " + (endTime-startTime) + "мс");
    }

    public static void main(String[] args) {
        // First
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


        //Second
        List<Integer> arrList = addArrayList();
        List<Integer> linkedList = addLinkedList();

        chooseFromArrayList(arrList);
        chooseFromLinkedList(linkedList);

        chooseNormFromArrayList(arrList);
        chooseNormFromLinkedList(linkedList);
    }
}
