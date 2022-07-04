package org.itmo.java.lesson6.homework.FifthPack;

import java.io.IOException;

public class AdminUser extends User {
    @Override
    public void setUserAge() throws IOException {
        this.userName = super.getConsole();
        System.out.println("Имя " + this.userName);
    }
}
