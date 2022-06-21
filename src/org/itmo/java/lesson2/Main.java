package org.itmo.java.lesson2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "X5", Color.BLUE, true);

        //System.out.println(car);

        car.setSeatPlace(5);
        car.setPrice(1000000);
        car.setEngineCapacity(5.0);

        //System.out.println(car);

        car.setColor(Color.GREEN);

        //System.out.println(car.getColor());

        long totalPrice = CarService.totalPrice(car, 250000);
        System.out.println(totalPrice);
    }
}

