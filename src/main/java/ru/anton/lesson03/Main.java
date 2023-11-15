package ru.anton.lesson03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Box <Orange> box1= new Box<>();
        Orange orange1 = new Orange(0.4f);
        Orange orange2 = new Orange(0.5f);
        Orange orange3 = new Orange(0.7f);
        Orange orange4 = new Orange(0.35f);
        box1.append(Arrays.asList(orange1, orange2, orange3, orange4));
        Box<Apple> box2 = new Box<>();
        Apple apple1 = new Apple(0);
        Apple apple2 = new Apple(0.7f);
        Apple apple3 = new Apple(0.4f);
        Apple apple4 = new Apple(0.6f);
        box2.append(Arrays.asList(apple1, apple2, apple3, apple4));

        box1.copmareByWeight(box2);

        Box <Fruit> box3 = new Box<>();
        box1.pourToBox(box3);
        box2.pourToBox(box3);
        System.out.println(box3.toString());
        System.out.println(box3.totalWeight() + " " + box3.countFruits());
    }
}
