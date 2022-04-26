package ru.geekbrains.lesson6;

abstract class Animal implements ActAnimal {
    private int runLimit;
    private  int swimLimit;
    private String className;

    Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass().getSimpleName();
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String run(int distance) {
        if (distance > runLimit) {
            return  className + "couldn't run" + distance;
        } else  {
            return className + "successfully run" + distance;
        }
    }

    @Override
    public String swim(int distance) {
        if (distance > swimLimit) {
            return  className + "couldn't swim" + distance;
        } else  {
            return className + "successfully swim" + distance;
        }
    }

    @Override
    public String toString() {
        return  className + " runLimit: " + runLimit + ", swimLimit: " + swimLimit;
    }
}
