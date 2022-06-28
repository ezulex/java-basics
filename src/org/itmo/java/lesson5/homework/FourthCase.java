package org.itmo.java.lesson5.homework;

public class FourthCase {
    /**
     * Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.
     */

    public static int countStringContains(String text, String containingText) {
        int buf = -1;
        int counter = 0;
        for (int i = 0; i < text.length();) {
            buf = text.indexOf(containingText, i);
            if(buf >= 0) {
                i = buf + 1;
                counter++;
            } else {
                break;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int result = countStringContains("Это текст для проверки вхождения слова текст", "текст");
        System.out.println(result);
    }
}
