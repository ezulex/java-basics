package org.itmo.java.lesson9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(123);
        list.add("String");
        list.add(true);

//        System.out.println(list);

        List<String> strings = new ArrayList<>();
        strings.add("250");
        strings.add("123");
        strings.add("sfsf");
        strings.add("Sfsf");

//        strings.add(123);
//        strings.add(false);

        System.out.println(strings);
        Collections.sort(strings);
        System.out.println(strings);

        Collections.reverse(strings);
        System.out.println(strings);

        List<Integer> integers = new ArrayList<>();
        integers.add(123);
        integers.add(56456);
        integers.add(4646);
        integers.add(4556);
        integers.add(46);

        List<Integer> integers1 = Arrays.asList(12123, 21324, 234124);

        Set<String> set = new LinkedHashSet<>(); //new TreeSet<>(); //new HashSet<>();
        for (int i = 0; i < 100; i++) {
            set.add("Java");
        }

        System.out.println(set);

        set.add("Java1");
        set.add("Java1");
        set.add("777");
        set.add("String");

        System.out.println(set);




        Map<String, Integer> map = new HashMap<>();
        map.put("John", 12554);
        map.put("Vasya", 645);
        map.put("Denis", 546456);
        map.put("Bob", 125454);
        map.put("Bob", 555);

        System.out.println(map);

        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();

        //Доставть значение по ключу
        Integer integer22 = map.get("Vasya");
        System.out.println(integer22);

        //Достать ключ по значению
        String keyByValue = getKeyByValue(map, 546456);
        System.out.println(keyByValue);

    }

    //Достать ключ по значению
    public static String getKeyByValue(Map<String, Integer> map, Integer value) {
        String result = null;

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer mapValue = pair.getValue();
            if (value.equals(mapValue)) {
                result = key;
            }
        }
        return result;
    }
}
