package org.itmo.java.lesson6.homework.FourthPack;

import java.io.IOException;

public class GiftBox extends Box {

    public void getThingCount() {
        System.out.println(super.thingCount);
    }

    @Override
    public void setThingCount() throws IOException {
        super.setThingCount();
    }
}
