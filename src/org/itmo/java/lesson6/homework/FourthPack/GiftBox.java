package org.itmo.java.lesson6.homework.FourthPack;

public class GiftBox extends Box {
    public GiftBox(int thingCount) {
        super(thingCount);
    }

    public void getThingCount() {
        System.out.println(super.thingCount);
    }
}
