package ru.geekbrains.lesson7;

public class Cat {

    private String name;
    private int appetite;
    private boolean fullness;



    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void setFullness(boolean fullness) {
        this.fullness = fullness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public  void eatFood(Plate plate) {
        plate.looseFood(appetite);
    }

    public void info() {
        System.out.println("[" + name + ", " + appetite + "]");
    }

    public boolean isFullness() {
        return fullness;
    }

}
