package ru.anton.homework04;

import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {
    private Map<Integer, Worker> workers;
    List<Worker> resultFind;


    public PhoneBook () {
        this.workers = new HashMap<>();
    }

    public void addWorker(Worker worker) {
        workers.put(worker.getNumTab(), worker);
    }

    public void addAllWorkers (Worker ... workers) {
        for (int i = 0; i < workers.length; i++) {
            this.workers.put(workers[i].getNumTab(), workers[i]);
            System.out.println(workers[i]);
        }
    }

    public List <Worker> findByExperience(int experience) {
        resultFind = workers.values().stream()
                .filter(worker -> {
                    System.out.println(worker);
                    return worker.getExperience() == experience;
                }).collect(Collectors.toList());
        return resultFind;
    }

}
