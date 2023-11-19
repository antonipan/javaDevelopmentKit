package ru.anton.seminar05.ex01;

public class Main {

    public static void main(String[] args) {
        ObjectA objectA = new ObjectA();
        ObjectB objectB = new ObjectB();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}

/**
 * В рамках выполнения задачи необходимо:
 * Создать два класс ObjectA, ObjectB
 * Реализовать класс в котором два потока при запуске провоцируют DeadLock для объектов ObjectA, ObjectB
 */