package ru.anton.homework04;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        List <Worker> listResult = new LinkedList<>();
        Worker worker1 = new Worker("Ivan", "8531", 5);
        Worker worker2 = new Worker("Ivan", "35", 3);
        Worker worker3 = new Worker("Maxim", "111", 10);
        Worker worker4 = new Worker("Olga", "125", 5);
        Worker worker5 = new Worker("Pavel", "6666", 1);
        Worker worker6 = new Worker("Inna", "7758", 2);
        Worker worker7 = new Worker("Inna", "33348", 3);
        Worker worker8 = new Worker("Masha", "0011", 7);
        Worker worker9 = new Worker("Kira", "2212", 4);
        Worker worker10 = new Worker("Lera", "16", 3);
        phoneBook.addAllWorkers(worker1, worker2, worker3,
                                worker4, worker5, worker6,
                                worker7, worker8, worker9, worker10);
        System.out.println("Список сотрудников со стажем: ");
        System.out.println(phoneBook.findByExperience(3));
        System.out.println("Список номеров сотрудника: ");
        System.out.println(phoneBook.findPhoneByName("Inna"));
        System.out.println("Сотрудник, найденный по табельному номеру. ");
        System.out.println(phoneBook.findByTableNumber(10));

    }
}
