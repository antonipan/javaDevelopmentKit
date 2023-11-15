package ru.anton.seminar03;

public class Main {
    public static void main(String[] args) {
        int t = 0;
        int k = 0;
        String s = "";
        SameClass<Object, Object, Object> sameClass = new SameClass<>(t, k, s);
        sameClass.print();
    }
}
