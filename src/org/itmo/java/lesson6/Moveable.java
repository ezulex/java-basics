package org.itmo.java.lesson6;

public interface Moveable {
    public static final String NAME = "Brand";
    public abstract void printTransportInfo();
    public abstract String transportName();

    default void someMethod() {
        System.out.println("someMethod");
    };

    static void staticMethod() {
        //logic
    }
}
