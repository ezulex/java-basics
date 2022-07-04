package org.itmo.java.lesson6.homework.FifthPack;

import java.io.IOException;

import static org.itmo.java.lesson6.homework.GetString.getStringFromKeyboard;

public class User {
    protected Integer userAge;
    protected String userName;

    public void setUserAge() throws IOException {
        this.userAge = Integer.parseInt(getStringFromKeyboard("возраст пользователя"));
    }

    public void setUserName() throws IOException {
        this.userName = getStringFromKeyboard("имя пользователя");
    }
}
