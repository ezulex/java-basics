package org.itmo.java.lesson5.homework;

public class ThirdCase {

    public static String stringReplace(String text) {
        text = text.replace("бяка", "[вырезано цензурой]");
        return text;
    }

    public static void main(String[] args) {
        String result = stringReplace("Эта бяка, ей надо заменить. Нельзя использовать такое слово бяка.");
        System.out.println(result);
    }
}
