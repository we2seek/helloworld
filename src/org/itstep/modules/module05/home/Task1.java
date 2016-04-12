package org.itstep.modules.module05.home;

import java.util.Random;

/**
 * Created by Vitaliy Timchenko on 26.03.16 12:41.
 * 1. Заполнить двумерный массив [7,7] случайными числами (10..99 включительно).
 * Найти MAX и MIN для каждой строки массива. Результат вывести на экран в формате:
 * "Строка №_: MAX=__ MIN=__"
 * "Строка №_: MAX=__ MIN=__"
 */
public class Task1 {

    public static void main(String[] args) {
        final int ROWS = 7;
        final int COLUMNS = 7;

        final int RANDOM_MIN = 10;
        final int RANDOM_MAX = 99;
        int rowMax, rowMin;
        final Random r = new Random();

        // MapDemo array of random numbers
        int[][] arr = new int[ROWS][];
        // Additional array with max and min value for each row
        int[] minMax = new int[ROWS * 2];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[COLUMNS];

            rowMin = Integer.MAX_VALUE;
            rowMax = Integer.MIN_VALUE;

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(RANDOM_MAX - RANDOM_MIN + 1) + RANDOM_MIN;
                if (arr[i][j] < rowMin) {
                    rowMin = arr[i][j];
                }
                if (arr[i][j] > rowMax) {
                    rowMax = arr[i][j];
                }
            }
            minMax[i] = rowMin;
            minMax[i + ROWS] = rowMax;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < minMax.length /2; i++) {
            System.out.printf("Строка №%d: MAX = %3d, MIN = %3d\n", i+1, minMax[i + ROWS], minMax[i]);
        }

    }

    public int[][] generateArray(final int rows, final int cols) {
        int arr[][] = new int[rows][];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[cols];
        }

        return arr;
    }
}
// 0  1  2  3  4  5