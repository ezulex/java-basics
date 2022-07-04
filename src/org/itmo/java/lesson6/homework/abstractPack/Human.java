package org.itmo.java.lesson6.homework.abstractPack;

public abstract class Human implements Information {
    protected String name;
    protected String lastName;

    public Human(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //abstract void getInformation();
}
