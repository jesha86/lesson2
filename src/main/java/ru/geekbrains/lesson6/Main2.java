package ru.geekbrains.lesson6;

public class Main2 {
    public static void main(String[] args) {
        Cat cat = new Cat(200, 0);
        Dog dog = new Dog(500, 10);

        ActAnimal[] animals = {cat, dog};
        for (ActAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(150));
            System.out.println(animal.run(250));
            System.out.println(animal.run(550));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(15));
        }
    }
}
