/*
 *Java 1. Homework 3
 *
 *@author Evgeniya
 *@version 30/03/2020
 */
package ru.geekbrains.lesson2;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        int[] inputArray1 = {1, 0, 1, 1, 0, 0, 0, 1};
        System.out.println("Before" + Arrays.toString(inputArray1));
        change(inputArray1);
        System.out.println("After " + Arrays.toString(inputArray1));

        int[] inputArray2 = new int[100];
        fillIn(inputArray2);
        System.out.println(Arrays.toString(inputArray2));

        int[] inputArray3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Before" + Arrays.toString(inputArray3));
        doubleArray(inputArray3);
        System.out.println("After " + Arrays.toString(inputArray3));

        int x = 5;
        int [][] inputArray4 = new int[x][x];
        fillDiagonal(inputArray4);
        printArray(inputArray4);

        System.out.println(Arrays.toString(returnArray(10, 2)));
    }
    static void change(int[] array) {
        for (int i = 0; i < array.length; i++)
        if (array[i] == 1) {
            array[i] = 0;
        } else {
            array[i] = 1;
        }
    }

    static void fillIn(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = i + 1;
    }

    static void doubleArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;
    }

    static void fillDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }
    }
    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[] returnArray(int len, int initialValue) {
        int [] inputArray5 = new int[len];
        for (int i = 0; i < inputArray5.length; i++) {
            inputArray5[i] = initialValue;
        }
        return inputArray5;
    }
}
