package ru.anton.lesson03;

public abstract class Fruit {

    private Float weight;

    public Fruit (float weight) {
        if(weight <= 0) {
            throw new NullPointerException();
        }
        this.weight = weight;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        if(weight <= 0) throw new WeightExeption();
        this.weight = weight;
    }

}
