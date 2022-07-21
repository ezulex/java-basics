package org.itmo.java.lesson14.homework;

public class NameThread extends Thread {
    String name;
    String currentName;

    public static final Object monitor = new Object();
    public NameThread(String name) {
        this.name = name;
        this.currentName = name;
    }

    @Override
    public void run() {
        synchronized (monitor) {
            do {

                while (!currentName.equals(name)) {
                    try {
                        currentName = name;
                        monitor.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(name);
                currentName = "";
                monitor.notify();

            } while (true);
        }
    }
}
