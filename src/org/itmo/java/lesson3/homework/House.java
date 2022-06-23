package org.itmo.java.lesson3.homework;

import java.time.LocalDate;

public class House {
    private int floorsCount;
    private int year;
    private String name;

    public int getFloorsCount() {
        return floorsCount;
    }

    public void setFloorsCount(int floorsCount) {
        this.floorsCount = floorsCount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
//        LocalDate current_date = LocalDate.now();;
//        int res = current_date - year;
//        return res;
        return 2022 - year;
    }
}
