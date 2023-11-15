package ru.anton.lesson03;

public class WeightExeption extends NullPointerException {
    public WeightExeption () {
        super("Вес фрукта не должен быть равен 0. ");
    }
}
