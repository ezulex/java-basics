package org.itmo.java.lesson3.homework;

public class Tree {
    private int age;
    private boolean isAlive;
    private String name;

    public Tree(int a, String n) {
        age = a;
        name = n;
    }

    public Tree(int a, boolean al, String n) {
        this.age = a;
        this.isAlive = al;
        this.name = n;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "age=" + age +
                ", isAlive=" + isAlive +
                ", name='" + name + '\'' +
                '}';
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }
}
