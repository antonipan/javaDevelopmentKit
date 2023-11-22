package ru.anton.homework05;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        Table table = new Table(20, 5);
        Philosof ph1 = new Philosof("СОКРАТ", table);
        Philosof ph2 = new Philosof("ПЛАТОН", table);
        Philosof ph3 = new Philosof("АРИСТОТЕЛЬ", table);
        Philosof ph4 = new Philosof("ПИФАГОР", table);
        Philosof ph5 = new Philosof("ДИОГЕН", table);
        ph1.start();
        ph2.start();
        ph3.start();
        ph4.start();
        ph5.start();


    }
}

