package org.itmo.java.lesson7.homework;

public class Plane {

    static class Wing {
        public Integer weight;

        public void getWingWeight() {
            System.out.println(weight);
        }

        public Wing(Integer weight) {
            this.weight = weight;
        }
    }
}
