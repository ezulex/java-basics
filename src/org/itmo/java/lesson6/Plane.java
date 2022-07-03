package org.itmo.java.lesson6;

public class Plane extends Transport {
    public Plane(Integer weight, Integer seatPlace, Boolean isFlying) {
        super(weight, seatPlace, isFlying);
    }

    @Override
    void abstractMethod() {
        System.out.println("abstractMethod");
    }

    @Override
    public void printTransportInfo() {

    }

    @Override
    public String transportName() {
        return null;
    }
}
