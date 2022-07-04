package org.itmo.java.lesson6.homework.FourthPack;

import java.io.IOException;

import static org.itmo.java.lesson6.homework.GetString.getStringFromKeyboard;

public class Box {
    protected Integer thingCount;

    public void setThingCount() throws IOException {
        this.thingCount = Integer.parseInt(getStringFromKeyboard("количество вещей в коробке"));
    }
}
