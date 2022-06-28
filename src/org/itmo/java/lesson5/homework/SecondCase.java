package org.itmo.java.lesson5.homework;

public class SecondCase {

    public static boolean isPalindrom(String text) {
        text = text.replace(" ", "");
        char[] chars = text.toCharArray();
        char[] chars1 =new char[chars.length];
        String resultString = "";

        for (int i = chars.length - 1; i >= 0;) {
            for (int j = 0; j < chars1.length; j++) {
                chars1[j] = chars[i];
                i--;
                resultString += chars1[j];
            }
        }

        System.out.println(text);
        System.out.println(resultString);
        return text.equalsIgnoreCase(resultString);
    }

    public static void main(String[] args) {
        boolean result = isPalindrom("А роза упала на лапу Азора");
        System.out.println(result);
    }
}
