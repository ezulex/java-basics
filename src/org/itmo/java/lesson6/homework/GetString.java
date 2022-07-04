package org.itmo.java.lesson6.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetString {
    public static String getStringFromKeyboard(String queryName) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите " + queryName + ":");
        return reader.readLine();
    }
}
