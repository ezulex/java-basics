package org.itmo.java.lesson6;

public class Parent {
    public String field = "Field";
    public void print() {
        System.out.println("Method from " + this.getClass().getSimpleName() + " class");
    }
}
