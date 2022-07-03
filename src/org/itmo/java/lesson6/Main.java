package org.itmo.java.lesson6;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        //Инкапсуляция
////        Car car = new Car();
//        Field[] declaredFields = car.getClass().getDeclaredFields();
//
//        for (Field declaredField : declaredFields) {
//            System.out.println(declaredField);
//        }

        //Наследование
//        Object object = new Object();
//        object.equals(object);
//
//        Parent parent = new Parent();
//        Parent parent2 = new Child();
//        Child parent4 = new Child();
//        Parent parent3 = new AnotherChild();
//
//        parent.print();
//        parent2.print();
//        parent3.print();
//
//        parent4.someMethod();

        //Полиморфизм
        Moveable bus = new Bus();
        Moveable vehicle = new Car();

        System.out.println(printTransportInfo(bus));
        System.out.println(printTransportInfo(vehicle));


    }

    public static Moveable printTransportInfo(Moveable transport) {
        transport.printTransportInfo();
        return transport;
    }
}
