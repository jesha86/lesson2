package ru.geekbrains.lesson7;

import ru.geekbrains.lesson5.Employee;

public class App {

    public static void main(String[] args) {

        Cat[] cat = new Cat[4];

            cat[0] = new Cat("Barsik", 33);
            cat[1] = new Cat("Bonya", 48);
            cat[2] = new Cat("Marusya", 50);
            cat[3] = new Cat("Mursik", 25);


        Plate plate = new Plate(100);

        for (Cat c : cat) {
            while (!c.isFullness() && plate.getFood() >= c.getAppetite()) {
                c.eatFood(plate);
                plate.info();
            }
        }
        for (Cat c : cat) {
            if (c.isFullness()) {
                System.out.println(c.getName() + " " + "наелся");
            } else {
                System.out.println(c.getName() + " " + "остался голодным, ему не хватило еды");
            }
        }
    }
}
