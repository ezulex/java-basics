package org.itmo.java.lesson3.homework;

public class Car {
    private String color;
    private String name;
    private int weight;

    public Car(String col) {
        color = col;
    }

    public Car(String col, int w) {
        color = col;
        weight = w;
    }

    public Car() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }


}
