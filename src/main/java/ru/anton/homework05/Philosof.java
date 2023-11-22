package ru.anton.homework05;

import javax.management.monitor.Monitor;
import java.rmi.server.ExportException;
import java.util.concurrent.atomic.AtomicInteger;

public class Philosof extends Thread {
    private String name;
    private int fork;
    private Table table;
    private int eaten;
    private final Object monitor;


    public Philosof (String name, Table table) {
        this.name = name;
        this.fork = 0;
        this.table = table;
        this.monitor = Table.class;
    }

    @Override
    public void run() {
        while (table.spagetti > 0) {
            while (table.fork > 0) {
                System.out.println("Вилок на столе: " + table.fork);
                try {
                    Thread.sleep(300);
                    if (table.fork > 0 && fork < 2) {
                        table.decr();
                        fork++;
                        System.out.printf("Философ %s взял %d вилку \n", name, fork);
                    } else if (table.fork == 0 || fork == 2) {
                        break;
                    } else if (table.fork == 0 && fork < 2) {
                        this.interrupt();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            System.out.printf("Философ %s имеет %d вилок. \n", name, fork);
            if (fork == 2) {
                try {
                    Thread.sleep(300);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                table.decrSpagetti();
                eaten++;
                System.out.printf("Философ %s поел. Спагетти осталось - %d \n", name, table.spagetti);
            }
            table.fork = 5;
            fork = 0;
            if (isInterrupted()) {
                this.start();
            }
        }
        if (table.spagetti == 0) {
            try {
                this.interrupt();
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(String.format("Спагетти закончился... %s съел %d", name, eaten));
    }

}
