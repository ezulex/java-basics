package org.itmo.java.lesson14.homework;

import java.time.LocalDateTime;

public class MyThread extends Thread {
    Integer k;

    public MyThread(Integer i) {
        this.k = i;
    }

    @Override
    public void run() {
        int i = 0;
        while (i <= k) {
            System.out.println(LocalDateTime.now() + " - Поток " + Thread.currentThread().getName() + " выводит число: " + i);
            i++;
        }
    }
}
