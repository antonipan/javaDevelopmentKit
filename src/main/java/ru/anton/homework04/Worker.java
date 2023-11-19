package ru.anton.homework04;

public class Worker {
    private static int ID = 0;

    private int numTab;
    private String name;
    private String phone;
    private int experience;

    public Worker (String name, String phone, int experience) {
        ++ID;
        this.numTab = ID;
        this.name = name;
        this.phone = phone;
        this.experience = experience;
    }

    public Worker (Worker worker) {
        this.numTab = worker.getNumTab();
        this.name = worker.getName();
        this.phone = worker.getPhone();
        this.experience = worker.getExperience();
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
