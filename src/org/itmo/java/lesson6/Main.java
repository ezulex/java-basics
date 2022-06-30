package org.itmo.java.lesson6;

import org.itmo.java.lesson3.homework.Car;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        //Инкапсуляция
//        Car car = new Car();
//
//        Field[] declaredFields = car.getClass().getDeclaredFields();
//
//        for (Field declaredField : declaredFields) {
//            System.out.println(declaredField);
//        }

        //Наследование
        Object object = new Object();
        object.equals(object);

        Parent parent = new Parent();
        Parent parent2 = new Child();
        Child parent4 = new Child();
        Parent parent3 = new AnotherChild();

        parent.print();
        parent2.print();
        parent3.print();

        parent4.someMethod();

    }
}
