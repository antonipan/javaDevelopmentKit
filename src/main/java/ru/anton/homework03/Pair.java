package ru.anton.homework03;

public class Pair <E1, E2> {
    E1 elem1;
    E2 elem2;

    public Pair (E1 e1, E2 e2) {
        this.elem1 = e1;
        this.elem2 = e2;
    }
    public Pair () {
    }

    public E1 getFirst() {
        return elem1;
    }

    public E2 getSecond() {
        return elem2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "elem1 = " + elem1.getClass() +
                ", elem2 = " + elem2.getClass() +
                '}';
    }
}
