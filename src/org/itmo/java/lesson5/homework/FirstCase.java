package org.itmo.java.lesson5.homework;

public class FirstCase {

    public static String getLongestWord(String text) {
        String[] subString;
        String splitter = " ";
        String longestWord = "";

        subString = text.split(splitter);

        for (int i = 0; i < subString.length; i++) {
                if(longestWord.length() < subString[i].length()) {
                    longestWord = subString[i];
                }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        String result = getLongestWord("Этот текст состоит из шести слов");
        System.out.println(result);
    }
}
