package ru.anton.lesson03;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <T extends Fruit> {
    private ArrayList <T> listOfFruits;


    public Box () {
        listOfFruits = new ArrayList<>();
    }

    public void append(T value) {
        listOfFruits.add(value);
    }
    public void append (List<T> list) {
        listOfFruits.addAll(list);
    }

    public float totalWeight() {
        float totalWeight = 0;
        if (listOfFruits.size() == 0) return totalWeight;
        for (Fruit fruit: listOfFruits
             ) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public int countFruits() {
        return listOfFruits.size();
    }

    public void copmareByWeight(Box<?> box) {
        if(totalWeight() == box.totalWeight()) {
            System.out.println("Вес коробок равен");
        } else if (totalWeight() > box.totalWeight()) {
            System.out.println("1-ая коробка больше второй");
        } else {
            System.out.println("2-ая коробка меньше первой. ");
        }
    }

    public void pourToBox (Box <? super T> box) {
        box.listOfFruits.addAll(listOfFruits);
        this.listOfFruits.clear();
    }

    @Override
    public String toString() {
        return "Box{" +
                "listOfFruits=" + listOfFruits +
                '}';
    }
}
