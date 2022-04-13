package ru.geekbrains.lesson5;

public class Employee {
    private String name;
    private int salary;
    private String profession;
    private int age;
    private String email;
    private String telephone;

    public Employee(String name, int salary, String profession, int age, String email, String telephone) {
        this.name = name;
        this.salary = salary;
        this.profession = profession;
        this.age = age;
        this.email = email;
        this.telephone = telephone;
    }

    public void infoEmployee() {
        System.out.println("ФИО: " + name + "; Зарплата: " + salary+ "; Должность: " + profession +
                "; Возраст: " + age + "; email: " + email + "; телефон: " + telephone);
    }

    public int getAge() {
        return age;
    }

}
