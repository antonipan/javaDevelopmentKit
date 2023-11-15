package ru.anton.seminar03;

public class SameClass <T, V, K> {
    private T t;
    private V v;
    private K k;

    public SameClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    @Override
    public String toString() {
        return "SameClass{" +
                "t=" + t.getClass() +
                ", v=" + v.getClass() +
                ", k=" + k.getClass() +
                '}';
    }

    public void print () {
        System.out.println(this);
    }
}
