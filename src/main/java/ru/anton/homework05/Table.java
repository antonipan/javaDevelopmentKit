package ru.anton.homework05;

import ru.anton.lesson05.ex04.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Table {
    public volatile int spagetti;
    public volatile int fork;
    private ArrayList<Philosof> philosofs;

    public Table(int spagetti, int fork) {
        this.spagetti = spagetti;
        this.fork = fork;
    }

    public void setSpagetti(int spagetti) {
        this.spagetti = spagetti;
    }
    public int getSpagetti() {
        return this.spagetti;
    }

    public synchronized void decr() {
        fork--;
    }
    public synchronized void decrSpagetti() {
        spagetti--;
    }
}
