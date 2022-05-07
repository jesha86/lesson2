package ru.geekbrains.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void looseFood(int appetite) {
        food -= appetite;
    }

    public void info() {
        System.out.println("[" + food + "]");
    }
}
