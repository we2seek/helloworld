package org.itstep.modules.module05.students.lashkov_max;

import java.util.Random;

/**
 * 1. Заполнить двумерный массив [7,7] случайными числами (10..99 включительно).
 * Найти MAX и MIN для каждой строки массива. Результат вывести на экран в формате:
 * "Строка №_: MAX=__ MIN=__"
 * "Строка №_: MAX=__ MIN=__"
 */
public class Task1 {
    public static void main(String[] arr) {
        int[][] da = new int[7][7];
        int i = 0;
        int j;
        Random rnd = new Random();
        for (i = 0; i < da.length; i++) {
            for (j = 0; j < da[0].length; j++) {
                // Диапазон случайных чисел не соотв заданию
                da[i][j] = rnd.nextInt(100);
                System.out.print(da[i][j] + "\t");
            }
            System.out.println();
        }
        for (i = 0; i < da.length; i++) {
            int max = da[i][0];
            int min = da[i][0];
            for (j = 0; j < da[0].length; j++) {

                if (min > da[i][j]) {
                    min = da[i][j];
                }
                if (max < da[i][j]) {
                    max = da[i][j];
                }
            }
            // Формат вывода не соотв заданию
            System.out.print("столбец №:" + (i + 1) + " " + "максимальное число:" + max + " " + "минимальне число:" + min);
            System.out.println();
        }
    }
}
