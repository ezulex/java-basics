package org.itmo.java.lesson5.homework;

public class FifthCase {

    public static String invertString(String text) {
        String resultText = "";
        String[] subString;
        String splitter = " ";
        subString = text.split(splitter);

        for (int i = 0; i < subString.length; i++) {

            char[] chars = subString[i].toCharArray();
            char[] chars1 =new char[chars.length];

            for (int j = chars.length - 1; j >= 0;) {
                for (int k = 0; k < chars1.length; k++) {
                    chars1[k] = chars[j];
                    j--;
                    resultText += chars1[k];
                }
            }

            resultText += splitter;

        }

        return resultText;
    }

    public static void main(String[] args) {
        String result = invertString("Инвертировать строку в обратную сторону");
        System.out.println(result);
    }
}
