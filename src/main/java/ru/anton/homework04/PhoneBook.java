package ru.anton.homework04;

import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {
    private Map<Integer, Worker> workers;
    List<Worker> resultFind;


    public PhoneBook () {
        this.workers = new HashMap<>(10);
    }

    public void addWorker(Worker worker) {
        workers.put(worker.getNumTab(), worker);
    }

    public void addAllWorkers (Worker ... workers) {
        for (int i = 0; i < workers.length; i++) {
            addWorker(workers[i]);
        }
    }

    public void print () {
        var values = workers.values();
        for (var value: values
             ) {
            System.out.println(value);
        }
    }

    /**
     * Метод поиска по стажу работы
     * @param experience - указанный стаж
     * @return - список найденных сотрудников
     */
    public List <Worker> findByExperience(int experience) {
        return workers.values().stream()
                .filter(exp -> exp.getExperience() == experience)
                .collect(Collectors.toList());
    }

    /**
     * Метод поиска номера телефона по имени.
     * @param name - принимает имя
     * @return - список номеров телефонов
     */
    public List<Integer> findPhoneByName (String name) {
        List<Integer> phone = workers.values().stream()
                .filter(e -> e.getName().toLowerCase().equals(name.toLowerCase()))
                .map(Worker::getPhone)
                .map(Integer::parseInt).toList();
        return phone;
    }

    /**
     * Поиск сотрудника по табельному номеру
     * Так как табельный номер уникален, то метод возвращает одного сотрудника.
     * @param number - искомый номер
     * @return - сотрудник
     */
    public Worker findByTableNumber(int number) {
        if(!workers.containsKey(number) && workers.get(number) == null) {
            throw new RuntimeException();
        }
        return workers.get(number);
    }
}
