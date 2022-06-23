package org.itmo.java.lesson3.homework;

import java.time.LocalDate;
import java.time.Period;

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
        LocalDate current_date = LocalDate.now();;
        LocalDate date = LocalDate.of(year, 1, 1);
        Period period = Period.between(date, current_date);
        return period.getYears();
        //return 2022 - year;
    }
}
