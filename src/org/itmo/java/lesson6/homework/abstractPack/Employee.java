package org.itmo.java.lesson6.homework.abstractPack;

public class Employee extends Human {
    private String bankName;

    public Employee(String name, String lastName, String bankName) {
        super(name, lastName);
        this.bankName = bankName;
    }

    @Override
    public void getInformation() {
        System.out.println("Name: " + name);
        System.out.println("Last name: " + lastName);
        System.out.println("Bank name: " + bankName);
    }
}
