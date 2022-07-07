package org.itmo.java.lesson7.homework;

public class Plane {
    private Wing wing;
    public Plane(Integer weight) {
        this.wing = new Wing(weight);
        wing.getWingWeight();
    }

    class Wing {
        public Integer weight;

        public void getWingWeight() {
            System.out.println(weight);
        }

        public Wing(Integer weight) {
            this.weight = weight;
        }
    }
}