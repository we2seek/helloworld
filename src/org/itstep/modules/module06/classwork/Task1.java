package org.itstep.modules.module06.classwork;

import java.util.Arrays;

/**
 * Created by timchenko on 28.03.2016.
 */
public class Task1 {

    final static int ROWS = 6;
    final static int COLS = 3;


    /**
     * Вывод массива на экран
     *
     * @param innerArray Массив, который нужно вывести
     */
    public static void printArray(int[][] innerArray) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(innerArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String toString(int [][] innerArray){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                builder.append(innerArray[i][j]);
                builder.append(' ');
            }
            builder.append('\n');
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        final int SIZE = 10;

        int[] arr = new int[SIZE];
        int[][] matr = new int[ROWS][COLS];
        int counter = 0;

        for (int i = 0; i < COLS; i++) {
            for (int j = 0; j < ROWS; j++) {
                matr[j][i] = ++counter;
            }
        }

//        printArray(matr);

        System.out.println(toString(matr));
    }
}
