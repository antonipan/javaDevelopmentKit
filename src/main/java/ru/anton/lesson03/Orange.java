package ru.anton.lesson03;

public class Orange extends Fruit {
    public Orange(float weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Апельсин (вес + %f" + getWeight();
    }
}
