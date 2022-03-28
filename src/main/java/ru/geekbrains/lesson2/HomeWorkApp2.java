/*
*Java 1. Homework 2
*
*@author Evgeniya
*@version 28/03/2020
 */
package ru.geekbrains.lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        System.out.println(checkSum(20,10));
        number(5);
        checkNumber(-12);
        printString("Строка", 6);
    }
    static boolean checkSum(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }
    static void number(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    static void checkNumber(int a) {
        if (a <= 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    static void printString(String value, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(i + value);
        }
    }
}
