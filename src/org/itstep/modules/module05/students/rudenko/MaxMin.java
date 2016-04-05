package org.itstep.modules.module05.students.rudenko;

/**
 * Заполнить двумерный массив [7,7] случайными числами (10..99 включительно).
 * Найти MAX и MIN для каждой строки массива. Результат вывести на экран в формате:
 * "Строка №_: MAX=__ MIN=__"
 * "Строка №_: MAX=__ MIN=__"
 */

import java.util.Random;

public class MaxMin {
    public static void main(String[] args) {
        Random r = new Random();
        int arr[][] = new int[7][7];
        int max[] = new int[7];
        int min[] = new int[7];
        for (int i = 0; i < arr.length; i++) {
            min[i] = 100;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (int) Math.floor(Math.random() * 90 + 10);
                if (max[i] < arr[i][j]) {
                    max[i] = arr[i][j];
                }
                if (min[i] > arr[i][j]) {
                    min[i] = arr[i][j];
                }
                System.out.print(arr[i][j] + "[" + (i + 1) + "," + (j + 1) + "]" + "  ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Строка №" + (i + 1) + ": MAX=" + max[i] + " MIN=" + min[i]);
        }
    }
}
