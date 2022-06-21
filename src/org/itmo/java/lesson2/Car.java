package org.itmo.java.lesson2;

public class Car {
    private String brand;
    private String model;
    private int seatPlace;
    private Color color;
    private long price;
    private double engineCapacity;
    private boolean isNew;

    public Car(String brand, String model, Color color, boolean isNew) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.isNew = isNew;
    }
}
