package org.itmo.java.lesson6.homework.extendPack;

public class Truck extends Vehicle {
    public Integer wheelsCount;
    public Integer maxWeight;

    public void newWheels(Integer wheelsCount) {
        this.wheelsCount = wheelsCount;
        System.out.println("New wheels count: " + wheelsCount);
    }

    public Truck(int w, String m, char c, float s, Integer wheelsCount, Integer maxWeight) {
        super(w, m, c, s);
        this.wheelsCount = wheelsCount;
        this.maxWeight = maxWeight;
    }
}
