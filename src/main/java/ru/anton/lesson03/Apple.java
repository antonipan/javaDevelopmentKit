package ru.anton.lesson03;

public class Apple extends Fruit {
    public Apple(float weight) {
        super(weight);
    }


    @Override
    public String toString() {
        return "Яблоко (вес + %f" + getWeight();
    }
}
