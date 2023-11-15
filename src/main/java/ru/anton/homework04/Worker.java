package ru.anton.homework04;

public class Worker {
    private static int numTab = 0;
    private String name;
    private String phone;
    private int experience;

    public Worker (String name, String phone, int experience) {
        numTab++;
        this.name = name;
        this.phone = phone;
        this.experience = experience;
    }

    public int getNumTab () {
        return numTab;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", experience=" + experience +
                '}';
    }
}
