package ru.anton.lesson05;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("2. Hello, world. " + Thread.currentThread());
    }
}
