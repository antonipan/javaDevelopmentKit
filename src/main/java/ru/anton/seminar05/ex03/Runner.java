package ru.anton.seminar05.ex03;

public class Runner extends Thread {

    private int distance;
    private Running running;

    public Runner (int distance, Running running) {
        this.distance = distance;
        this.running = running;
    }

    @Override
    public void run() {

    }
}
