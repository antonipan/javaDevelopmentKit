package ru.anton.lesson05;

public class Program {

    public static void main(String[] args) {
//        System.out.println("Hello, world. ");
//        System.out.println(Thread.currentThread().getName());
//        for (int i = 0; i < 5; i++) {
//            new MyThread().start();
//        }
//        for (int i = 0; i < 5; i++) {
//            new Thread(new MyRunnable()).start();
//        }
//        for (int i = 0; i < 5; i++) {
//            new Thread(() -> {
//                System.out.println("3. Hello, world!" + Thread.currentThread());
//            }).start();
//        }
        Thread tic = new Thread(new TicTac("["));
        Thread tac = new Thread(new TicTac("]"));
        tic.start();
        tac.start();
    }
}
