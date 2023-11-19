package ru.anton.lesson05;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("1. Hello, world. " + Thread.currentThread());
    }
}
