package ru.anton.seminar04;

import java.util.*;

public class Programm {
    public static void main(String[] args) {
        List<String> manName = new ArrayList<>(Arrays.asList("Иван", "Андрей", "Гораций", "Люций", "Юлий"));



    }

    public static void sortedByName (List <String> list) {
        Collections.sort(list);
    }

    public static void sortByLength (List <String> list ) {
        list.sort(Comparator.comparing(String::length));
    }

    public static void sortByRevers(List <String> list) {
        Collections.reverse(list);
    }
}
