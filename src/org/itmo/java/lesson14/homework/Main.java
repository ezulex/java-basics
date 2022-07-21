package org.itmo.java.lesson14.homework;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        /**
         * 1-2 задание
         */
//        List<Object> thredsList = new ArrayList<>();
//
//        for (int i = 0; i < 11; i++) {
//            thredsList.add(i, new MyThread(100));
//            Thread myThread = (Thread) thredsList.get(i);
//            System.out.println(LocalDateTime.now() + " - Поток " + myThread.getName() + ": " + myThread.getState());
//            myThread.start();
//            System.out.println(LocalDateTime.now() + " - Поток " + myThread.getName() + ": " + myThread.getState());
//        }
//
//        for (int i = 0; i < thredsList.size(); i++) {
//            Thread myThread = (Thread) thredsList.get(i);
//            if (myThread.isAlive()) {
//                i--;
//            } else {
//                System.out.println(LocalDateTime.now() + " - Поток " + myThread.getName() + ": " + myThread.getState());
//            }
//        }

        /**
         * 3 задание
         */
        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(){
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        counter.increment();
                    }
                }
            };

            thread.start();

            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(counter.getCount());



    }
}
