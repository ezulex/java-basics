package org.itmo.java.lesson6.homework.FifthPack;

import java.io.IOException;

import static java.lang.Integer.parseInt;
import static org.itmo.java.lesson6.homework.GetString.getStringFromKeyboard;

public class User {
    protected Integer userAge;
    protected String userName;

    public String getConsole() throws IOException {
        String result = getStringFromKeyboard("значение");
        return result;
    }

    public void setUserAge() throws IOException {
        this.userAge = parseInt(getConsole());
        System.out.println("Возраст " + this.userAge);
    }
}
